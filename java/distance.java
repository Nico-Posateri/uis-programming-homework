/*
A program that prompts the user to enter two points (x1, y1)
and (x2, y2) and displays their distance.
The formula for computing the distance is:
sqrt[(x2 - x1)^2(y2 - y1)^2]
*/

import java.util.Scanner; // Imports the Scanner class

class distanceBetweenPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble(); // Accepts user input for the first point's x
		double y1 = input.nextDouble(); // Accepts user input for the first point's y
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble(); // Accepts user input for the second point's x
		double y2 = input.nextDouble(); // Accepts user input for the second point's y
		
        // Subtracts x1 from x2, squares results, subtracts y1 from y2, squares results, then adds both results
        double square = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double sqrRoot = Math.pow(square, 0.5); // Calculates the square root of the previous result

        System.out.print("The distance between two points is " + sqrRoot); // Prints result
	}
}
