package asg1;

/**
 * COP3337 Assignment 1- Defining Classes
 * @author dcant019 
 */
public class Vehicle {
	
	private double tankSize; // the initial size of the tank
	private double efficiency; // efficiency of the vehicle
	private double fuelInTank; // the amount of fuel in a tank
	
	/**
	 * Vehicle used to check the amount of fuel left after traveling a certain distance
	 * @param tankSize the initial size of the tank
	 * @param efficiency the efficiency of the vehicle
	 */
	public Vehicle(double tankSize, double efficiency)
	{
		this.tankSize = tankSize;
		this.efficiency = efficiency;
		fuelInTank = 0;
	}
	
	/**
	 * calculates how much fuel can be filled depending on the fuel existing in the tank 
	 * and the tank’s capacity
	 * @return tank capacity
	 */
	public double availableTankCapacity()
	{
		return tankSize - fuelInTank;
	}
	
	/**
	 * method receives number of gallons to add in the tank 
	 * and checks the tank’s capacity before adding the petrol
	 * @param gallons number of gallons
	 */
	public void addPetrol(double gallons) {	
		// If the available tank’s capacity is less than 
		// the amount of gallon received to fill in the tank,
		if (availableTankCapacity() < gallons)
		// this will print an error message and adds the petrol otherwise.
		{
			System.out.println("Error: cannot overfill tank");
			return;
		}
		System.out.println("Adding " + gallons + " gallons fuel to tank");
		fuelInTank = fuelInTank + gallons;
		System.out.println("Fuel In Tank = " + fuelInTank + " gallons");
		System.out.println("You can travel " + driveTo() + " miles with available fuel.");
	}
	
	/**
	 * what distance can be traveled with the available fuel and provided efficiency
	 * @return distance efficiency*fuelInTank
	 */
	public double driveTo() {
		return efficiency * fuelInTank;
	}
	
	public String toString()
	{
		return "Fuel In Tank = " + fuelInTank + "\n" +
				"Total Capacity of Tank = " + tankSize + "\n" +
				"Fuel Efficiency = " + efficiency + "\n" +
				"Available Capacity of Tank = " + availableTankCapacity();
		
	}

}
