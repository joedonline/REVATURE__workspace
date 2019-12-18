package com.revature.objectoriented;

public class Driver {

	public static void main(String[] args) {
		
		demoTruck();
		
		Driver nonStaticDeiver = new Driver();
		
		// INSTANCE-based
		nonStaticDeiver.demoScopeNonStatic();
		
		// OBJECT-based
		Driver.demoScopeStatic();
		
	}
	
	public static void demoTruck() {
		
		 Truck truck = new Truck(100.0, 180, "blue", "Roehl", 1500.0, 500);
		 
		 try {
			 truck.drive();
			 truck.tow(500, 1500);
		 } catch (InsufficientTowingPowerException e) {
			 e.printStackTrace();
		 } catch (OutOfFuelException e) {
			 e.printStackTrace();
		 } finally {
			 truck.towingPower = 1000; // just random here
		 }
		
	}
	
	void demoVehicle() {
		
		
		
	}
	
	public static void demoScopeStatic() {
		
		Vehicle staticVehicle = new Vehicle(15.0,  100,  "green", "honda");
		
		int v = Vehicle.NUMBER_OF_WHEELS;		
		
	}
	
	public void demoScopeNonStatic() {
		
		Vehicle nonStaticVehicle = new Vehicle(15.0,  100,  "blue", "toyota");
		
		int v = Vehicle.NUMBER_OF_WHEELS;	
		
	}

}
