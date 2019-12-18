package com.revature.objectoriented;

public class Truck extends Vehicle {

	/* fields */
	Double bedCapacity; // bedCapacity 	:: Double
	Integer towingPower; // towingPower	:: Integer
	Boolean towing;
	
	public Truck(Double fuel, Integer topSpeed, String color, String model,
			Double bedCapacity, Integer towingPower) {
		super(fuel, topSpeed, color, model);
		this.bedCapacity = bedCapacity;
		this.towingPower = towingPower;
	}
	
	/* methods */	
	void tow() {
		
		if (this.towingPower > 1) {
			System.out.println("Towing normal...");
		}
		
	}
	
	public void tow(Integer towingPower, Integer topSpeed) throws InsufficientTowingPowerException {
		
		if (this.towingPower > towingPower && this.topSpeed > topSpeed) {
			System.out.println("Towing at " + towingPower);
			this.towing = true;
		} else {
			
			// System.out.println("Failed to tow.");
			
			this.towing = false;
		}
		
	}
	
	void takeLoad() {
		System.out.println("Loading truck.");
	}
	
}
