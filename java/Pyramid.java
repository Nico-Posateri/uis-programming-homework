/*
A program that prompts the user to enter an integer
from 1 to 15 and displays a pyramid.
*/

import java.util.Scanner; // Imports the Scanner class

public class Pyramid {
        public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter the number of lines: "); // Asks user to enter how many lines long the pyramid is
		int lines = input.nextLine(); // Accepts the number
		
		input.close(); // Closes the Scanner input

  // Prints the pyramid
		System.out.println();
        }
}
