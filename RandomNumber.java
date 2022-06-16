package com.Task_14_04_22;

/*Write a program that generates a random number between 1 to 30 and asks the user to
guess what the number is. If the user's guess is higher than the random number, the 
program should display "Too high, try again". If the user's guess is lower than the
random number the program should display "Too low, try again". The program should use 
the loop that repeats until the user correctly guesses the random number. */

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	// attributes
	int guessTheNumber, answer;

	// constant
	final int maxNumber = 30;
	boolean loopRunner = true;

	// Scanner class
	Scanner random = new Scanner(System.in);

	public void randomNumberFinder() {
		// Random class
		Random randNumber = new Random();
		answer = randNumber.nextInt(maxNumber) + 1;

		// while-loop
		while (loopRunner) {

			System.out.println("Guess the number between 1 to 30 :");
			guessTheNumber = random.nextInt();

			// if-else statement
			if (guessTheNumber < answer) {
				System.out.println("Too low, the number was, try again");
			}

			else if (guessTheNumber > answer) {
				System.out.println("Too high, the number was, try again");
			} else {
				System.out.println("You guess the right number ");
				loopRunner = false;
			}

		}
	}
}