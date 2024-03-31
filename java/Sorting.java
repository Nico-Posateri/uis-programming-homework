/*
A program that prompts a user to enter a list and displays whether the list is sorted or not.
*/

import java.util.Scanner; // Imports the Scanner class

public class Sorting {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a new Scanner object
	        System.out.print("Enter list: "); // Asks user to enter a list
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		input.close(); // Closes the Scanner input

		System.out.println("The list is " + (isSorted(list) ? "already sorted." : "not sorted."));
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
