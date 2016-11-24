package example;

import java.util.Scanner;

public class ComputeAreaWithConstant {
	private static double raidus;

	public static void main(String[] args) {
		final double PI = 3.14159;
		
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt the user to enter a radius
		System.out.println("Enter a number for raidus: ");
		double radius = input.nextDouble();
		
		// compute area
		double area = radius * raidus * PI;
		
		// display result
		System.out.println("The area for the circle of radius " +
				radius + " is " + area);
	}
}
