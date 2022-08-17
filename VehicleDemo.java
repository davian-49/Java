package asg1;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter tank size of your car: ");
		double tankSize = input.nextDouble();
		System.out.println("Enter fuel efficiency: ");
		double efficiency = input.nextDouble();
		Vehicle car = new Vehicle(tankSize, efficiency);
		System.out.println(car);
		System.out.println("How much gallons of petrol to add?: ");
		double petrol = input.nextDouble();
		input.close();	
		car.addPetrol(petrol);
		
		
		/**Vehicle car = new Vehicle(17, 21.5);
		System.out.println(car);
		car.addPetrol(16.5);**/

	}

}
