/*
A program that prompts the user to enter a Social Security number in
the format DDD-DD-DDDD, where D is a digit, and denies invalid formats.
*/

import java.util.Scanner; // Imports the Scanner class

public class Phone {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
	        System.out.print("Enter an SSN: "); // Asks user for a valid SSN
		String ssn = input.nextLine();

		// Implement check for proper length, format

		System.out.print(ssn + " is a valid SSN"); // Currently says anything is valid
        }
}
