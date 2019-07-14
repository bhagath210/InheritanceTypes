package com.pioneercoders.inheritance;

class Vehicles { // super class
	String Name; 
	static String DroneName; // we have put static in front of variable bcz we used variable in static method

	public void front(String Name) { // method 1
		System.out.println(Name + " " + "Vehicle Moves forward");
	}

	public void back(String Name) { // method 2 with String as parameter
		System.out.println(Name + " " + "Vehicle Moves backward");
	}
}

class AdvanceVehicle extends Vehicles { // sub class
	static int DroneNumber = 18;// we have put static in front of variable bcz we used variable in static method
	public void fly(String Name) { // method 1 with String as parameter in sub-class
		System.out.println(Name + " " + "Vehicle flies upward");
	}
}

public class InheritanceClassesEx {
	public static void main(String args[]) {
		AdvanceVehicle Drone = new AdvanceVehicle(); // creating an object names as Drone
		AdvanceVehicle.DroneName = "VEGA";
		System.out.println("\t"+ "Drone Name "+AdvanceVehicle.DroneName);
		System.out.println("\t"+"Drone Number "+AdvanceVehicle.DroneNumber);
		Drone.front("Drone"); 
		Drone.back("Drone");
		Drone.fly("Drone");
	}
}