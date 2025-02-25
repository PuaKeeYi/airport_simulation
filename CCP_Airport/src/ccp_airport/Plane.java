package ccp_airport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Plane extends Thread{
    public String name; 
    public String waitingQTime; // to store the wait time of the plane from starting the thread until get called by ATC.
    private boolean isEmergency; 
    private String gate; // the assigned gate
    private boolean refuelState; 
    public int totalPassenger; // Variable that store the initial numbers of passenger and also store the boarded passenger
    
    public ATC ATC;
    public refuelTruck RT;
    public LinkedList<Plane> runwayLock, leavingOrder;

    Random random = new Random();
    String timeStartWait; // time start waiting 
    String timeEndWait; // time get called by ATC
    
    public Plane(String name, boolean isEmergency, ATC ATC,refuelTruck RT, 
            String gateAssigned, LinkedList<Plane> runwayLock, LinkedList<Plane> leavingOrder) 
    {
        this.name = name;
        this.isEmergency = isEmergency;
        this.ATC = ATC;
        this.RT = RT;
        this.gate = "";
        this.runwayLock = runwayLock;
        this.leavingOrder = leavingOrder;
        this.totalPassenger = random.nextInt(45) + 5;
        this.refuelState = false;
    }
    
    @Override
    public void run(){
        // the run method is to simulate the actions that will be done by a plane thread.
        try {
            // start and wait here
            waitForLanding();
            // notify by ATC, and start to land
            proceedLanding();
            this.waitingQTime = getDuration(timeStartWait, timeEndWait); // calculate the Queue waiting time
            Thread.sleep(2000); // docking
            System.out.println(name + "  : Docking at " + this.gate + ".");
            Thread.sleep(2000);

            // refuel truck comes in
            Thread refuelThread = refuelSupply();
            refuelThread.start();
            disembarkingPassengers();
            Thread.sleep(5000); 
            embarkingPassengers();
            // synchronized block which block the thread to proceed if the refuel and cleaning thread is not finished.
            if(!this.refuelState){System.out.println(name + "  : waiting for refuel truck to complete the refuel process.");}
            synchronized (this) { 
                if(!this.refuelState){
                    this.wait();
                }
            }
            System.out.println(name + "  : Finished disembark, embarking passenger and refuel, ready to undock.");
            Thread.sleep(2000);
            // plane leaving 
            waitForLeaving();   
        } catch (InterruptedException | ParseException e) {
            System.out.println(name + "  : Stay at the gate interrupted.");
        }
    }
    
    // run when the plane thread is created, put the plane thread to sleep.
    private synchronized void waitForLanding() {
        try {
            System.out.println(name + "  : Arrived at the airport asking for landing.");
            timeStartWait = this.getTime();
            wait(); // Puts the thread to sleep until it's notified
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted while waiting.");
        }
    }
    // run after the plane is notify by the ATC.
    // the plane occupy runway which the permission is given by ATC, the runway only realease after this method
    private void proceedLanding() throws InterruptedException{
        synchronized (this) {
            timeEndWait = this.getTime();
            System.out.println(name + "  : Received the arrangement prepared to land.");
            this.notify();
            this.wait(); // notify by the ATC and then proceed the landing.
            
            // the plane keep doing his landing here
            System.out.println(name + "  : Occupying the runway.");
            Thread.sleep(5000); 
            System.out.println(name + "  : Finished using runway, moving towards " + this.gate + ".");
            this.notify();//wake up ATC to tell that curretn plane thread finished using runway, runway is usable.
        }
    }
    
    // the thread is create to communicate with refuel truck. 
    public Thread refuelSupply(){
        Thread refuelThread = new Thread(() -> {
            try{
                synchronized (this) {
                    RT.requestRefuel(this); // run the method created in refuel truck class
                    this.refuelState = true;
                    this.notify(); 
                }
            }catch (InterruptedException e) {
                System.out.println(" refuealTruck error.");
            }
        });
        return refuelThread;
    }
    
    // asumptions maximum 50 passenegers and they are ready to embark and disembark.
    private void disembarkingPassengers() throws InterruptedException {
        System.out.println("\n    ---" + name + "  : Starting passenger disembarkation at "+ this.gate + ". Total passengers: " + totalPassenger +"\n");

        while (totalPassenger > 0) {
            int passengersDisembarkingNow = random.nextInt(5) + 1; // Random number between 1 and 5 disembark at a time
            int disembarkTime = random.nextInt(500) + 500; // Randomized delay 

            // make sure it doesnt disembark more passengers than are left
            if (passengersDisembarkingNow > totalPassenger) {
                passengersDisembarkingNow = totalPassenger;
            }

            totalPassenger -= passengersDisembarkingNow;
            Thread.sleep(disembarkTime);  // Simulate time for this group to leave

            System.out.println("    " + name + "  : " + totalPassenger + " passengers remaining.");
        }

        System.out.println("\n    ---" + name + "  : All passengers have disembarked, the plane is preparing for the next group of passenger.\n");
    }
        
    
    private void embarkingPassengers() throws InterruptedException{
        int waitingPassengers = new Random().nextInt(45) + 5; // Random number of waiting passengers
        int maxPassengers = 50; 
        System.out.println("    ---" + name + "  : Starting embark process, "+waitingPassengers+" passeneger at " + this.getGate() + " are allow to ride the plane.");
        
        while (totalPassenger < maxPassengers && waitingPassengers > 0) { 
            int passengersBoardingNow = random.nextInt(5) + 1; // Random number between 1 and 5 board at a time
            int embarkTime = random.nextInt(500) + 500; // Randomized delay

            // Ensure we don't exceed capacity or board more passengers than are waiting
            if (passengersBoardingNow > waitingPassengers) {
                passengersBoardingNow = waitingPassengers;
            }
            if (totalPassenger + passengersBoardingNow > maxPassengers) {
                passengersBoardingNow = maxPassengers - totalPassenger;
            }

            totalPassenger += passengersBoardingNow;
            waitingPassengers -= passengersBoardingNow;
            Thread.sleep(embarkTime);  // Simulate time for this group to board

            // Calculate and print the boarding percentage
            double boardingPercentage = ((double) totalPassenger / maxPassengers) * 100;
            System.out.printf("    %s  : %.2f%% of capacity filled. %d passengers waiting to board.\n", name, boardingPercentage, waitingPassengers);
        }
        System.out.printf("\n    ---%s  : All passengers have boarded. Plane is at %.2f%% capacity.\n\n", name, ((double) totalPassenger / maxPassengers) * 100);
    }
     
    // when the plane finished the refuel and embarking passenger, the plane thread will run this
    private void waitForLeaving() throws InterruptedException{
        synchronized (runwayLock){
            System.out.println(name + "  : Asking permission to occupied runway to leave.");
            runwayLock.addLast(this);
            leavingOrder.addLast(this);
            runwayLock.notify(); // wakes up the waiting ATC thread
        }
        synchronized(this){
            wait(); // Puts the thread to sleep until it given permission to leave
            System.out.println(name + "  : Occupying the runway to leave.");
            Thread.sleep(5000);
            System.out.println(name + "  : Leave the airport sucessfully.");
            notify();
        }
    }
    

    public void assignGate(String gateName) {
        gate = gateName;
    }
    
    public String getGate(){
        return gate;
    }
    
    public boolean isEmergency() {
        return isEmergency;
    }

    public String getRealName() {
        return name;
    }
    
    private String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
    
    private String getDuration(String inTime, String outTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String inTimeOnly = inTime.substring(11, 19);
        String outTimeOnly = outTime.substring(11, 19);

        Date date1 = format.parse(inTimeOnly);
        Date date2 = format.parse(outTimeOnly);

        long difference = date2.getTime() - date1.getTime();
        return Long.toString(difference);
    }
}
