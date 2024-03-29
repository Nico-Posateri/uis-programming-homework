/*
A program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds,
converts it to kilograms, and displays the result.
1 pound is equal to 0.454 kilograms.
*/

import java.util.Scanner; // Imports the Scanner class

public class Conversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Type a number in pounds and press enter: ");
		double pounds = input.nextDouble(); // Accepts user input to the pounds variable

		input.close(); // Closes the Scanner input
		
		double kilograms = pounds * 0.454; // Converts pounds to kilograms
		System.out.print(pounds + " pounds is " + kilograms + " killograms"); // Prints result
	}
}
