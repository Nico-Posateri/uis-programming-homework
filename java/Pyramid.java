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
			// Prints the spaces for current line
			for (int space = linesRequested - linesPrinted; space >= 1; space--) {
				System.out.print("  ");
			}
			// Prints descending numbers for current line
			for (int descNum = linesPrinted; descNum >= 2; descNum--) {
				System.out.print(descNum + " ");
			}
                        // Prints ascending numbers for current line
			for (int ascNum = 1; ascNum <= linesPrinted; ascNum++) {
				System.out.print(ascNum + " ");
			}
                        // Finishes printing the current line
			System.out.println();
		}
        }
}

/*///////////////////////////////// Another version, reoccurring issue: //////////////////////////////////////
//
// I was having an issue with the above program, where a number of lines greater than 9 would
// print uneven, like so:
//
// Enter the number of lines, between 1 and 15: 15
//                               1 
//                             2 1 2 
//                           3 2 1 2 3 
//                         4 3 2 1 2 3 4 
//                       5 4 3 2 1 2 3 4 5 
//                     6 5 4 3 2 1 2 3 4 5 6 
//                   7 6 5 4 3 2 1 2 3 4 5 6 7 
//                 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 
//               9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 
//             10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 
//           11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 
//         12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 
//       13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 
//     14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 
//   15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
//
// I found a tutorial on YouTube which covered this subject, and attempted their structure,
// which can be seen below. It's only slightly different and it produces the same error.
//
// The tutorial: https://www.youtube.com/watch?v=ykGoNW8XW5M
//
// I'm unsure if this is simply an error due to the double digits causing spacing issues below line 9.
// If this block is still present, it means I'm a fool and I haven't fixed this linesRequested > 9 issue. ):
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // Imports the Scanner class

public class Pyramid {
        public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // Creates a new Scanner object
		// Asks user to enter how many lines long the pyramid is
		System.out.print("Enter the number of lines, between 1 and 15: ");
		byte linesRequested = input.nextByte(); // Accepts the number

		input.close(); // Closes the Scanner input

		// While the number of lines to print is less than the user's input number, print lines . . .
		for (int linesPrinted = 1; linesPrinted <= linesRequested; linesPrinted++) {
			// Prints the spaces for current line
			for (int space = (byte) (linesRequested - linesPrinted); space >= 0; space--) {
				System.out.print("  ");
			}
			// Prints descending numbers for current line
			for (int descNum = linesPrinted; descNum > 0; descNum--) {
				System.out.print(descNum + " ");
			}
                        // Prints ascending numbers for current line
			for (int ascNum = 2; ascNum <= linesPrinted; ascNum++) {
				System.out.print(ascNum + " ");
			}
                        // Finishes printing the current line
			System.out.println();
		}
    	}
}

*/////////////////////////////////////////////////////////////////////////////////////////////////////////////
