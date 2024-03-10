/*
A program that prompts the user to enter a password
and displays "Valid Password" if the rules are followed,
or "Invalid Password" otherwise. The rules are:
  - A password must have at least eight characters
  - A password must contain only letters and digits
  - A password must contain at least two digits
*/

import java.util.Scanner; // Imports the Scanner class

public class Password {
	// Requests user input a password, checks password validity below:
	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.println("A password must:\n" + 
				   " - Have at least eight characters\n" + 
				   " - Contain only letters and digits\n" + 
				   " - Contain at least two digits"); // Displays password rules
		System.out.print("Enter a password: "); // Requests user input of a password
		String password = input.nextLine(); // Accepts user password input

        	input.close(); // Closes the Scanner input

		// Display "Valid password" or "Invalid password" based on checks made to user input in methods below
		System.out.print(isPasswordValid(password) ? "Valid password" : "Invalid password");
	}
	// Checks password validity based on the rules calculated in methods below, results in true or false:
	public static boolean isPasswordValid(String password) {
		int MINIMUM_NUMBER_OF_CHARACTERS = 8;
		int MINIMUM_NUMBER_OF_DIGITS = 2;

		boolean validPassword = 
			lengthValid(password, MINIMUM_NUMBER_OF_CHARACTERS) && 
			lettersAndDigits(password) && 
			minimumDigits(password, MINIMUM_NUMBER_OF_DIGITS);

		return validPassword;
	}
	// Method to determine if the password is of valid length, a minimum of 8 characters:
	public static boolean lengthValid(String password, int validLength) {     
                return password.length() >= validLength; // Passes a password that meets minimum length requirement
	}

	// Method to determine if the password contains only letters and digits:
	public static boolean lettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.letterOrDigit(password.charAt(i))) {
				return false; // Flags characters that are not a letter or digit, returns false for invalid
			}
		}
		return true; // If all characters pass the check, lettersAndDigits is true
	}

	// Method to check if the password has the minimum number of digits:
	public static boolean minimumDigits(String password, int m) {
		int numOfDigits = 0; // Set to count number of digits in the password
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numOfDigits++; // Increments detected number of digits, looking for minimum of 2
			}
                        if (numOfDigits >= m) { // int m represents minimum digits, 2
				return true; // Minimum number of digits met, password passes minimumDigits check
			}
			else {
				return false; // Else, after checking all characters, less than 2 digits is invalid
			}
		}
	}
}
