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

		boolean isValid =
			(ssn.length() == 11) &&
		        (Character.isDigit(ssn.charAt(0)) &&
                        (Character.isDigit(ssn.charAt(1)) &&
                        (Character.isDigit(ssn.charAt(2)) &&
		        (ssn.charAt(3) == '-') &&
		        (Character.isDigit(ssn.charAt(4)) &&
                        (Character.isDigit(ssn.charAt(5)) &&
		        (ssn.charAt(6) == '-') &&
		        (Character.isDigit(ssn.charAt(7)) &&
                        (Character.isDigit(ssn.charAt(8)) &&
                        (Character.isDigit(ssn.charAt(9)) &&
                        (Character.isDigit(ssn.charAt(10));

		// Currently validates any string of exactly 11 characters
		System.out.print(ssn + " is " + ((isValid) ? "a valid" : "an invalid") + " SSN");
        }
}
