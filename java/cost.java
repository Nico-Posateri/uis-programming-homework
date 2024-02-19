/*
A program that compares the cost of two different packages.
The user is prompted to enter the weight and price of both packages.
The program will display the package with the better price.
*/

import java.util.Scanner; // Imports the Scanner class

public class Cost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates new Scanner object
		System.out.print("Enter the weight and price for package 1: "); // Ask for package 1 details
		double weight1 = input.nextDouble(); // User inputs package 1 weight
		double price1 = input.nextDouble(); // User inputs package 1 price
		
		System.out.print("Enter the weight and price for package 2: "); // Ask for package 2 details
		double weight2 = input.nextDouble(); // User inputs package 2 weight
		double price2 = input.nextDouble(); // User inputs package 2 price
		
		input.close(); // Closes the Scanner input
		
		if (price1 / weight1 > price2 / weight2) // If package 1 has a higher price per pound
			System.out.println("Package 2 has the better price.");
		else if (price1 / weight1 < price2 / weight2) // If package 2 has a higher price per pound
			System.out.println("Package 1 has the better price.");
		else
			System.out.println("Both packages have the same price");
	}
}
