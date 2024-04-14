/*
A program that prompts the user to enter a two-dimensional array and displays the location of
the largest element in the array.
*/

import java.util.Scanner; // Imports the Scanner class

public class Location {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates a new Scanner object
        // Asks user to enter the number of rows and columns in the array
	System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt(); // Accepts a number for the rows
        int columns = input.nextInt(); // Accepts a number for the columns
	double[][] array = new double[rows][columns];
        // Asks user to enter the array, established above
	System.out.println("Enter the array: ");
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			array[i][j] = input.nextDouble();
		}
	}
	input.close(); // Closes the Scanner input
	int[] location = locateLargest(array); // Pulls the location of the largest element from method locateLargest
	System.out.printf("The location of the largest element is at (%d, %d).", location[0], location[1]); // Prints the location of the largest element
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[]{ 0, 0 };
	double largest = a[0][0];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if (largest < a[i][j]) {
				largest = a[i][j];
				location[0] = i;
				location[1] = j;
			}
		}
	}
	return location;
    }
}
