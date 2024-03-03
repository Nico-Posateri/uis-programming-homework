/*
A program that prompts the user to enter an integer
from 1 to 15 and displays a pyramid.
*/

import java.util.Scanner; // Imports the Scanner class

public class Pyramid {
        public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // Creates a new Scanner object
		// Asks user to enter how many lines long the pyramid is
		System.out.print("Enter the number of lines, between 1 and 15: ");
		int linesRequested = input.nextInt(); // Accepts the number
		
		input.close(); // Closes the Scanner input

		// While the number of lines to print is less than the user's input number, print lines . . .
		for (int linesPrinted = 1; linesPrinted <= linesRequested; linesPrinted++) {
			// Fill content of lines . . .
			
			System.out.println();
		}
        }
}
