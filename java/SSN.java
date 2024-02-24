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

		input.close(); // Closes the Scanner input

		// Implement check for digits only, format with '-'
		boolean isValid =
			(ssn.length() == 11);

		// Currently validates any string of exactly 11 characters
		System.out.print(ssn + " is " + ((isValid) ? "a valid" : "an invalid") + " SSN");
        }
}
