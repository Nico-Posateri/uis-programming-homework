/*
A program that displays three numbers in increasing order, after
prompting the user to enter the three numbers.
*/

import java.util.Scanner; // Imports the Scanner class

public class Order {
	// Requests user input of 3 numbers, then displays the result of the displaySortedNumbers method:
	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter 3 numbers, separated by a space: "); // Requests user input of 3 numbers
		double num1 = input.nextDouble(); // Accepts user input for the first number
        	double num2 = input.nextDouble(); // Accepts user input for the second number
        	double num3 = input.nextDouble(); // Accepts user input for the third number

        	input.close(); // Closes the Scanner input
        
        	displaySortedNumbers(num1, num2, num3); // Displays the result of the method below
    	}
    	// Sorts the numbers input above in ascending order, returns result to above call:
    	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// Determine which of num1, num2, num3 is the highest, lowest...
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}

        	System.out.println(num1 + " " + num2 + " " + num3); // Orders numbers in ascending order
    	}
}
