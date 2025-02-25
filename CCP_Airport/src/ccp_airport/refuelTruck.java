package ccp_airport;

public class refuelTruck extends Thread {
    private Plane planeToRefuel;
    public boolean refuelTruckStatus = true;
    
    public refuelTruck() {
        this.setName("RefuelTruck");
    }
    
    public void run() {
        System.out.println(this.getName() + " : Ready and waiting for planes needing refuel.");
        try{
            
            while (refuelTruckStatus) {
                synchronized (this) {
                    // Wait until a plane notifies the truck for refueling
                    wait();
                    if (refuelTruckStatus){
                        System.out.println(this.getName() + " : Refueling " + planeToRefuel.getRealName() + "...");
                        Thread.sleep(15000);  // 15 second refueling
                        System.out.println(this.getName() + " : Refueling complete for " + planeToRefuel.getRealName());
                        notify();
                    }
                }
            }
        }catch (InterruptedException e) {
            System.out.println("Interupted.");
        }
        System.out.println(this.getName() + " : ATC shutted down, will go to rest.");
    }
    
    // this refuel method is used by plane object to communicated with refuel truck.
    public void requestRefuel(Plane plane)throws InterruptedException {
        synchronized(this){
            this.planeToRefuel = plane;
            System.out.println(plane.getRealName()+ "  : Ready to refuel, informing the refuel truck.");
            Thread.sleep(1000);
            this.notify(); // notify the refuel truck in waiting state. 
            this.wait(); // waiting for the refurl truck to inform when finished refuel.
            System.out.println(plane.getRealName()+ "  : Finished refuel, the refuel truck is leaving.");
        }
    }
    
    public void changeRefuelTruckStatus(boolean Status){
        refuelTruckStatus = Status;
    }
}
