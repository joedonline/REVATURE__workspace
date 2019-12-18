package com.revature.objectoriented;

public class Vehicle {

	/**
	 *  fields 
	 */
	static final Integer NUMBER_OF_WHEELS = 4; // final = can't be changed 
	Double fuel; // fuel :: Double
	Boolean running; // running	:: Boolean
	Integer topSpeed; // topSpeed :: Integer
	String color; // color :: String
	String model; // model :: String
	
	/**
	 * constructor(s)
	 */
	// normal constructor
	Vehicle() {
		super();
	}
	
	// another constructor(overloading)
	Vehicle(Double fuel, Integer topSpeed, String color, String model) {
		super();
		this.fuel = fuel;
		this.running = false;
		this.topSpeed = topSpeed;
		this.color = color;
		this.model = model;
	}
	
	// yet another constructor
	Vehicle(String someColor) {
		super();
		this.color = someColor;
		this.topSpeed = someColor.length();
	}
	
	/**
	 *  methods 
	 */
	void drive() {
		
		if (this.fuel > 0 && this.running) {
			System.out.println("Vroom.");
			this.fuel -= 1.0; // this.fuel - 1.0
		} else {
			System.out.println("Failed to drive");
		}
		
	}
	
	void turnOn() {
		this.running = true;
	}
	
	void turnOff() {
		this.running = false;
	}
	
	void refuel(Double amount) {
		
		if (amount > 0.0) {
			this.fuel += amount;
		} else {
			System.out.println("Failed to refuel.");
		}
		
	}
	
	@Override
	public String toString() {
		return "Vehicle [fuel=" + fuel + ", running=" + running + ", topSpeed=" + topSpeed + ", color=" + color
				+ ", model=" + model + ", NUMBER_OF_WHEELS" + NUMBER_OF_WHEELS + "]"; 
	}

}
