## Airport Simulation (Concurrent Programming in Java) ✈️ 

Programming language - Java    IDE - Apache Netbeans

Welcome to the Airport Simulation project! This is a Java-based simulation that models an airport's operations using concurrent programming. The goal is to manage the flow of planes while handling synchronization challenges, like refueling, gate availability, and emergency landings.



# Project Overview 🌟

This simulation was built as part of a Concurrent Programming assignment. It showcases how multiple threads (representing planes, ATC, passengers, and a refueling truck) interact while ensuring safe and efficient airport operations. 


# How It Works 🏗️

✅ One Runway, Many Planes – Only one plane can land/take off at a time. 

✅ Limited Airport Capacity – Only two planes can be on the ground (runway + gate). 

✅ Step-by-Step Process – A plane follows this sequence: 


Request landing clearance from ATC 

Land and taxi to an available gate 

Passengers disembark and new ones board (concurrent) 

Refueling (exclusive, only one truck available) 

Take off and free up the gate 


✅ Emergency Scenario – If two gates are occupied and a third plane arrives low on fuel, it gets priority for an emergency landing. 

✅ End-of-Simulation Stats – After all planes have left, we calculate:


Max/Average/Min waiting time for planes

Total planes served

Total passengers boarded



# The Concurrency Challenges 🔥 

Passengers boarding/disembarking happen concurrently 

Refueling is exclusive (only one truck, so planes must wait) 

Emergency landings need to be prioritized 

Proper synchronization using Java's concurrency features (synchronized, ReentrantLock, wait()/notify()) 



# Running the Simulation 🚀

Feel free to try out yourself! 

You can git clone or download the file and paste it in your NetBeansProjects folder and run it! 


You can alos go to run_simulation.yml file to run the simulation and check the output! 

The interface will looks like below: 

![image](https://github.com/user-attachments/assets/d6cb12e1-94c1-4afb-8efd-fb45ef6a18fc) 


