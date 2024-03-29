/*
A program that prompts the user to enter a lowercase or uppercase letter
and displays its corresponding number. For a nonletter input, display "invalid input".
The program uses the international standard letter / number mapping found on the telephone.
*/

import java.util.Scanner; // Imports the Scanner class

public class Phone {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter a letter: "); // Asks user for a letter
		char letter = input.next().charAt(0);
		letter = Character.toUpperCase(letter); // Converts letter to uppercase, negates need for lowercase cases

		input.close(); // Closes the Scanner input
		
		int number = 0; // A new value will be applied below, depending on chosen letter
		if(Character.isLetter(letter)) { // If the user's input is a letter . . .
			if(letter >= 'W') // Letter is W, X, Y, or Z
				number = 9;
			else if(letter >= 'T') // Letter is T, U, or V
				number = 8;
			else if(letter >= 'P') // Letter is P, Q, R, or S
				number = 7;
			else if(letter >= 'M') // etcetera . . .
				number = 6;
			else if(letter >= 'J')
				number = 5;
			else if(letter >= 'G')
				number = 4;
			else if(letter >= 'D')
				number = 3;
			else if(letter >= 'A')
				number = 2;
			System.out.print("The corresponding number is " + number);
		}
		else {
			System.out.print(letter + " is an invalid input"); // Prints for non-letter inputs
		}
	}
}

/*///////////////////////// First attempt, before Chapter 4 lecture: //////////////////////////
                
import java.util.Scanner; // Imports the Scanner class

public class Phone {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0); // Accepts user input for a single letter

                input.close(); // Closes the Scanner input

		// Prints a number based on the user's chosen letter . . .
		if(letter == 'A' || letter == 'a' || 
		   letter == 'B' || letter == 'b' || 
		   letter == 'C' || letter == 'c') {
			System.out.print("The corresponding number is 2");
		}
		else if(letter == 'D' || letter == 'd' || 
			letter == 'E' || letter == 'e' || 
			letter == 'F' || letter == 'f') {
			System.out.print("The corresponding number is 3");
		}
		else if(letter == 'G' || letter == 'g' || 
			letter == 'H' || letter == 'h' || 
			letter == 'I' || letter == 'i') {
			System.out.print("The corresponding number is 4");
		}
		else if(letter == 'J' || letter == 'j' || 
			letter == 'K' || letter == 'k' || 
			letter == 'L' || letter == 'l') {
			System.out.print("The corresponding number is 5");
		}
		else if(letter == 'M' || letter == 'm' || 
			letter == 'N' || letter == 'n' || 
			letter == 'O' || letter == 'o') {
			System.out.print("The corresponding number is 6");
		}
		else if(letter == 'P' || letter == 'p' || 
			letter == 'Q' || letter == 'q' || 
			letter == 'R' || letter == 'r' || 
			letter == 'S' || letter == 's') {
			System.out.print("The corresponding number is 7");
		}
		else if(letter == 'T' || letter == 't' || 
			letter == 'U' || letter == 'u' || 
			letter == 'V' || letter == 'v') {
			System.out.print("The corresponding number is 8");
		}
		else if(letter == 'W' || letter == 'w' || 
			letter == 'X' || letter == 'x' || 
			letter == 'Y' || letter == 'y' || 
			letter == 'Z' || letter == 'z') {
			System.out.print("The corresponding number is 9");
		}
		else {
			System.out.print(letter + " is an invalid input");
		}
    }
}

*//////////////////////////////////////////////////////////////////////////////////////////////
