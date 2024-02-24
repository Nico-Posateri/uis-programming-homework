/*
A program that prompts the user to enter a lowercase or uppercase letter
and displays its corresponding number. For a nonletter input, display "invalid input".
The program uses the international standard letter / number mapping found on the telephone.
*/

import java.util.Scanner; // Imports the Scanner class

public class Phone {
        public static void main(String[] args) {
		            Scanner input = new Scanner(System.in); // Creates a new Scanner object
		            System.out.print("Enter a letter: ");
		            char letter = input.next().charAt(0); // Accepts user input for a single letter

                input.close(); // Closes the Scanner input
		
		            System.out.print("The corresponding number is "); // Prints the number corresponding with the user's letter
        }
}
