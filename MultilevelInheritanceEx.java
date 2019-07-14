package com.pioneercoders.inheritance;

class Teams {
	int JerseyNumber;
	String TeamName;
	String Name;

	Teams() { // default constructor in super class

	}

	Teams(String TeamName, String Name, int JerseyNumber) // constructor with parameters in super class
	{
		this.TeamName = TeamName; // initializing the objects in sub class by using this keyword
		this.JerseyNumber = JerseyNumber; // initializing the objects in sub class by using this keyword
		this.Name = Name; // initializing the objects in sub class by using this keyword
		System.out.println("Team Name is: " + TeamName + " \n" + "The Player Name is: " + Name + " \n"
				+ "Jersey Number is: " + JerseyNumber);
		System.out.println(" ");
	}
}

class players extends Teams {
	String Nation;
	String State;

	players() // constructor in 1st sub class
	{
		super("India", "Virat", 18);// The Represents the Super Class Constructor
		System.out.println(" ");
	}

	void display(String Nation, String State) // method in 1st sub class
	{
		this.Nation = Nation;
		this.State = State;
		System.out.println("Nationality: " + Nation + " and " + "State: " + State);
	}
	public void coachDetails(String coachName) { // method in super class
		System.out.println("The Coach name is " + coachName);
	}
}

class Coach extends players {
	Coach() { // constructor in derived class of sub class
		coachDetails("RaviSasthri"); // calling method in sub class
	}
}

public class MultilevelInheritanceEx {
	public static void main(String args[]) { // main method
		players p = new players(); // calling 1st sub class constructor
		p.display("INDIA", "DELHI"); // calling method in 1st sub class
		Coach c = new Coach(); // calling 2nd sub class constructor
	}
}