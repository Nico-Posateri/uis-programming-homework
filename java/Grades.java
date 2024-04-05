/*
A program that prompts a user to enter the total number of students and all scores,
then displays the grades based on the following scale:
(1)  Grade is A if score is >= best - 10;
(2)  Grade is B if score >= best - 20;  
(3)  Grade is C if score is >= best - 30;
(4)  Grade is D if score is >= best - 40; 
(5)  Grade is F if otherwise
*/

import java.util.Scanner;

public class Grades {
	// Requests user inputs the number of students and their scores, displays grades
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Creates a new Scanner object
		System.out.print("Enter the number of students: "); // Asks user for the number of students
		int[] scores = new int[input.nextInt()]; // Stores scores, and...
		char[] grades = new char[scores.length]; // the corresponding grades!
		System.out.print("Enter " + scores.length + " scores: "); // Asks user to enter each student's scores...
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}

		input.close(); // Closes the Scanner input

		getGrades(scores, grades); // Fetches the grades after they're assigned by scores

		for (int i = o; i < scores.length; i++) { // Prints the student scores along with corresponding grades
			system.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}
	}

	// Returns the highest score of the group to compare against the other scores
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			for (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// Assigns grades to the scores
	public static void getGrades(int[] scores, char[] grades) {
		int best = max(scores);
		for (int i = 0; i < scores.length; i++) {
			// elifs for grades 'A', 'B', 'c", etc.
		}
	}
}
