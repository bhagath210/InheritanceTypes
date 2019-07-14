package com.pioneercoders.inheritance;

class Bikes {
	String BikeName;
	int ManufacturingYear;
	Bikes(){
		
	}
		Bikes(String BikeName, int ManufacturingYear)
		{
			this.BikeName = BikeName;
			this.ManufacturingYear = ManufacturingYear;
		    System.out.println(BikeName+" "+ManufacturingYear+" Model");
		}
	}

class Honda extends Bikes {
	Honda()
	{
		super("Unicorn", 2009);
		final String Number = "AP28CA1304";
		System.out.println("Vehicle Number is: "+Number);
		System.out.println("  ");
	}
}
class Hero extends Bikes {
	Hero() {
		super("Glammar", 2018);
	}
		
		void Hero (String Number)
		{
			//this.Hero();
			
			//this.Number = Number;
			System.out.println("Vehicle Number is: "+Number);
		}
}

public class HirarchicalInheritanceEx {
	public static void main(String args[]) { // main method
		Honda Bike = new Honda();
		Hero bike = new Hero();
		bike.Hero("AP37BE2810");
	}
}