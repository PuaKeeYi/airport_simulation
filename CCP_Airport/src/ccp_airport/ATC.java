package ccp_airport;

import java.util.LinkedList;

public class ATC extends Thread{
    public LinkedList<Plane> runwayLock, planeQueue, leavingOrder;
    boolean runway = true;
    public refuelTruck RT;
    
    private boolean gate1 = true;
    private boolean gate2 = true;
    private boolean ATCStatus = true; // true means available and awake.

    public ATC(LinkedList<Plane> planeQueue, LinkedList<Plane> runwayLock, refuelTruck RT, LinkedList<Plane> leavingOrder) {
        this.planeQueue = planeQueue;
        this.runwayLock = runwayLock;
        this.leavingOrder = leavingOrder;
        this.RT = RT;
        this.start();
        this.setName("ATC");
        
    }
    
    public void run() {
        System.out.println(this.getName() + "      : ATC is here to help the planes to land.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Plane arrival was interrupted.");
        }
        manageLanding();
        showStatistic();  
    }
    
    public void manageLanding() {
        while (true) {
            synchronized (runwayLock) {
                // this while loop is to check the two gate and the leaving queue. 
                // so if the both gate is empty and there is no plane in the leaving queue the ATC thread will ignore this while 
                while ((!gate1 && !gate2) || !runwayLock.isEmpty()) {
                    try {
                        StringBuilder statusMessage = new StringBuilder(this.getName() + "      : Next plane will need to wait.");
                        if (!gate1 && !gate2) {
                            statusMessage.append("Both gates are unavailable.");
                        } 
                        if(runwayLock.isEmpty()){ // means there is a plane staying at both gates.
                            System.out.println(statusMessage.toString());
                            runwayLock.wait(); // Wait until notified that either a gate becomes free
                            Thread.sleep(2000);
                        }
                        manageLeaving(runwayLock.poll()); // get the leaving plane
                    } catch (InterruptedException e) {
                        System.out.println(this.getName() + "      : Interrupted while waiting for runway or gate.");
                    }
                }
            }
            // Runway and at least one gate are now available, proceed with landing
            if (!planeQueue.isEmpty()) {
                Plane nextPlane = planeQueue.poll();  // Poll the first plane from the queue
                if (nextPlane != null) {
                    System.out.println("\n" + this.getName() + "      : Handling the next plane (" + nextPlane.getRealName() + ")");

                    // Assign the plane to an available gate
                    String assignedGate;
                    if (gate1) {
                        assignedGate = "gate1";
                        gate1 = false;  // Occupy gate 1
                    } else {
                        assignedGate = "gate2";
                        gate2 = false;  // Occupy gate 2
                    }
                    nextPlane.assignGate(assignedGate);
                    // Mark the runway as occupied
                    runway = false;
                    System.out.println(this.getName() + "      : " + nextPlane.getRealName() + " assigned to " + assignedGate + ".");
                }
                try {
                    // communicate with the handling plane 
                    synchronized(nextPlane){
                        nextPlane.notify();
                        nextPlane.wait(); 
                        System.out.println(this.getName() + "      : " + nextPlane.getRealName() + " is permitted to land...\n");
                        nextPlane.notify();
                        nextPlane.wait();
                        runway = true;
                    }
                } catch (InterruptedException e) {
                    System.out.println(this.getName() + "      : Interrupted while waiting for runway or gate.");
                }
            }

            if (runwayLock.isEmpty() && planeQueue.isEmpty() && (gate1 && gate2) && runway) {
                break;
            }
        }
        System.out.println("All the planes has finished handling. ATC is shutting down.");
        ATCStatus = false;
        // ATC inform the refuel truck to end.
        synchronized (RT) {
            RT.changeRefuelTruckStatus(false);
            RT.notify();
        }
    }
    
    public void manageLeaving(Plane leavingPlane) throws InterruptedException{
        synchronized (leavingPlane) {
            System.out.println(this.getName() + "      : " + leavingPlane.getRealName() + " is allow to leave.");
            leavingPlane.notify();
            if (leavingPlane.getGate().endsWith("gate1")) {
                gate1 = true;  // release gate 1
            } else {
                gate2 = true;  // release gate 2
            }
            leavingPlane.wait();
            Thread.sleep(2000);
        }
    }
    
    public void showStatistic(){
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------ATC Statistics----------------");
        System.out.println("-----------------------------------------------");
        System.out.println("true: available or awake; false: unavailable.");
        System.out.println(this.getName() + "      : Gate1's status " + gate1);
        System.out.println(this.getName() + "      : Gate2's status " + gate2);
        System.out.println("*ATC : The Sequence of Planes in order of finished:-");
        
        int waitingQTimeArray[] = new int[6];
        int counter = 0;
        int totalBoardedPassenger = 0;
        int planeServed = leavingOrder.size();
        while (leavingOrder.size() != 0) {
            Plane plane = leavingOrder.poll();
            System.out.println("-" + plane.name + " | waited for " + plane.waitingQTime + " miliseconds. ");
            waitingQTimeArray[counter] = Integer.parseInt(plane.waitingQTime);
            totalBoardedPassenger += plane.totalPassenger;
            counter++;
        }
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("*\tNumber of Planes served : " + planeServed);
        System.out.println("*\tNumber of Passengers boarded : " + totalBoardedPassenger);
        System.out.println("-----------------------------------------------");
        
        int max = waitingQTimeArray[0];
            int min = waitingQTimeArray[0];
            for (int i = 0; i < waitingQTimeArray.length; i++) {
                if (waitingQTimeArray[i] > max)
                    max = waitingQTimeArray[i];
                if (waitingQTimeArray[i] < min)
                    min = waitingQTimeArray[i];
            }

        System.out.println("*\tMaximum waiting time : " + max);
        System.out.println("*\tAverage waiting time : " + totalBoardedPassenger / 6);
        System.out.println("*\tMinimum waiting time : " + min);
        System.out.println("-----------------------------------------------");
    }
}
