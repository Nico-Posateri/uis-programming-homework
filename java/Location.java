/*
A program that prompts the user to enter a two-dimensional array and displays the location of
the largest element in the array by the following instructions:

1) Design a class named Location for locating a maximal value and its location in a two-dimensional array,
containing a public data field maxValue storing the maximal value as a double type and a public data fields row and column
storing the indices in a two-dimensional array as int types.

2) Write a method named locateLargest for returning the location of the largest element in a two-dimensional array.
Note that the return value is an instance of Location.
         public static Location locateLargest (double [ ][ ]  a)
*/

import java.util.Scanner; // Imports the Scanner class

public class Location {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Creates a new Scanner object
        // Asks user to enter the number of rows and columns in the array
	System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt(); // Accepts a number for the rows
        int columns = in.nextInt(); // Accepts a number for the columns
	double[][] array = new double[rows][columns];
        // Asks user to enter the array, established above
	System.out.println("Enter the array: ");
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			array[i][j] = in.nextDouble();
		}
	}
	input.close(); // Closes the Scanner input
	int location = locateLargest(array); // Pulls the location of the largest element from method locateLargest
	System.out.printf("The location of the largest element is __ at (%d, %d)."; // Prints the location of the largest element
    }

    public static Location locateLargest (double [ ][]  a) {
        int[] location = new int[]{ 0, 0 };
	double largest = a[0][0];
	for (int i = 0; i < array.length; i++) {
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
