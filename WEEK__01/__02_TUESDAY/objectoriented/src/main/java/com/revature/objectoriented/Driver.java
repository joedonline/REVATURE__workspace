package com.revature.objectoriented;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle myVehicle = new Vehicle(15.0, 300, "red", "Eclipse");
		
		System.out.println(myVehicle);
		
		myVehicle.turnOn();
		myVehicle.drive();
		myVehicle.refuel(5.0);
		
		System.out.println(myVehicle);
		
		/* fuel, topSpeed, color, model,
			bedCapacity, towingPower */
		Truck towTruck = new Truck(100.0, 200, "blue", "Benz", 
									400.5, 1500);
		
		towTruck.takeLoad();
		towTruck.tow();
		towTruck.tow(5000, 1501); // params :: towingPower, topSpeed
		
	}

}
