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
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Creates a new Scanner object
	  System.out.print("Enter the number of students: "); // Asks user for the number of students

		input.close(); // Closes the Scanner input

		System.out.println();
  }
}
