package con.revature.objectoriented.exceptionhandling;

import com.revature.objectoriented.InsufficientTowingPowerException;
import com.revature.objectoriented.OutOfFuelException;
import com.revature.objectoriented.Truck;

public class App {

	public static void main(String[] args) {
		
		Truck myTruck = new Truck(100.12, 200, "blue", "Benz", 1000.0, 500);
		
		try {
			testTowingPower(myTruck);
		} catch (OutOfFuelException e) {
			System.out.println("Refueling...");
			myTruck.refuel();
			// main(args); // optional.. "hack-ish"
		}

	}
	
	/**
	 * This method assumes the Truck passed into it has sufficient fuel.
	 * @param truck
	 * @throws OutOfFuelException
	 */
	public static void testTowingPower(Truck truck) throws OutOfFuelException {
		
		for (int testVal = 50; testVal <= 500; testVal += 50) {
			
			try {
				truck.tow(testVal, 50);
			} catch (InsufficientTowingPowerException e) {
				System.out.println("Not enough towing power to handle " + testVal);
				e.printStackTrace();
			}
			
		}
		
	}

}
