/*
A program that plays rock-paper-scissors between a user and NPC (computer).
The program will randomly generate a number for the NPC; 0 = rock, 1 = paper, 2 = scissors.
The user will be prompted to enter their choice between 0 and 2.
The program will calculate the victor and present the results.
*/

import java.util.Scanner; // Imports the Scanner class

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
		int NPC = (int)(Math.random() * 3); // Generates computer's random number
		
		System.out.print("Choose rock (0), paper (1), or scissors (2) and enter the number: ");
		int user = input.nextInt(); // Accepts user input of 0, 1, or 2

		input.close(); // Closes the Scanner input
		
		System.out.print("The NPC chose "); // Prints the computer's choice, listed below
		switch (NPC) { // Computer choices:
		case 0: System.out.print("rock. "); break;
		case 1: System.out.print("paper. "); break;
		case 2: System.out.print("scissors. "); break;
		}
		
		System.out.print("You chose "); // Prints the user's choice, listed below
		switch (user) { // User choices:
		case 0: System.out.print("rock. "); break;
		case 1: System.out.print("paper. "); break;
		case 2: System.out.print("scissors. "); break;
		}
		
		if (NPC == user)
			System.out.print("Stalemate."); // Prints stalemate if the user and NPC choose the same case
		else { // Else, calculate who wins based on rock-paper-scissors rules
			boolean win = (user == 0 && NPC == 2)
					|| (user == 1 && NPC == 0)
					|| (user == 2 && NPC == 1);
			if (win)
				System.out.println("You won!"); // Prints win if the user wins
			else
				System.out.println("You lost!"); // Prints loss if the user loses
		}
	}
}

// Might be fun to make the game loop for 3 rounds, then calculate the overall winner.
