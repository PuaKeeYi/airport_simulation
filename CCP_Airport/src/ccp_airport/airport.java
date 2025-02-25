package ccp_airport;

import java.util.LinkedList;
import java.util.Random;

import java.util.stream.Collectors;


public class airport {

    public static void main(String[] args) {
        LinkedList<Plane> planeQueue = new LinkedList<>();  // queue for landing. 
        LinkedList<Plane> runwayLock = new LinkedList<>();  // Lock for runway access also as a linklist that store the leaving plane. 
        LinkedList<Plane> leavingOrder = new LinkedList<>();
        Random random = new Random();
        System.out.println("-----------------------------------------------");
        System.out.println("------------Airport Simulation Start-----------");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Airport   : Starts to handle the arriving plane.\n");
        // Create and start the refuel truck
        refuelTruck refuelTruck = new refuelTruck();
        refuelTruck.start();

        // Create and start the ATC
        ATC ATC = new ATC(planeQueue, runwayLock, refuelTruck, leavingOrder);
        
        // Simulate the continuously arrival of the 6 plane
        for (int i = 1; i <= 6; i++) {
            boolean isEmergency = random.nextInt(10) < 2;  // 20% chance for an emergency plane
            Plane plane = new Plane("Plane " + i, isEmergency, ATC, refuelTruck, "", runwayLock, leavingOrder);
            plane.start();

            if (plane.isEmergency()) {
                System.out.println("Airport  : " + plane.getRealName() + " is an emergency and will cut the queue.");
                planeQueue.addFirst(plane);  // Emergency plane cuts queue
            } else {
                planeQueue.addLast(plane);   // Add norm plane
            }
            System.out.println("~~~ Airport  : Current landing queue: " + 
                planeQueue.stream()
                    .map(p -> p.getRealName() + (p.isEmergency() ? " (Emergency)" : ""))
                    .collect(Collectors.joining(", ")));
            try {
                Thread.sleep(random.nextInt(3000)); //Simulate the delay between plane arrivals
            } catch (InterruptedException e) {
                System.out.println("Plane arrival was interrupted.");
            }
        }
    }
}
