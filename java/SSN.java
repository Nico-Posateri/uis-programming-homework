/*
A program that prompts the user to enter a Social Security number in
the format DDD-DD-DDDD, where D is a digit, and denies invalid formats.
*/

import java.util.Scanner; // Imports the Scanner class

public class SSN {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
	        System.out.print("Enter an SSN: "); // Asks user for a valid SSN
		String ssn = input.nextLine();

		input.close(); // Closes the Scanner input

		boolean isValid = // User input is valid if . . .
			(ssn.length() == 11) && // Input is exactly 11 characters
		        (Character.isDigit(ssn.charAt(0))) && // The first character is a number
                        (Character.isDigit(ssn.charAt(1))) && // The second character is a number
                        (Character.isDigit(ssn.charAt(2))) && // The third character is a number
		        (ssn.charAt(3) == '-') && // The 4th character is a '-'
		        (Character.isDigit(ssn.charAt(4))) && // etcetera . . .
                        (Character.isDigit(ssn.charAt(5))) &&
		        (ssn.charAt(6) == '-') &&
		        (Character.isDigit(ssn.charAt(7))) &&
                        (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) &&
                        (Character.isDigit(ssn.charAt(10)));

		// Prints valid or invalid based on check above
		System.out.print(ssn + " is " + ((isValid) ? "a valid" : "an invalid") + " SSN");
        }
}
