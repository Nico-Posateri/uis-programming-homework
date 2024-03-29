/*
A program that prompts the user to enter a string and displays the characters at odd positions.
*/

import java.util.Scanner; // Imports the Scanner class

public class Odd {
        public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter a string: "); // Asks user to enter a string
		String string = input.nextLine(); // Accepts the string
		
		input.close(); // Closes the Scanner input

		// Pull odd characters from string
		String oddCharacters = "";

		// Logic for determining and holding odd characters
		for (int i = 0; i < string.length(); i += 2) {
			oddCharacters += string.charAt(i);
		}

		// Prints the odd characters from the entered string
		System.out.println(oddCharacters);
        }
}
