
package edu.ggc.mdeiters.ExtraCredit1;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Class: FootballTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 3, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 *
 */
public class FootballTester {

	private int index = 1;

	/**
	 * Method: enterScores 
	 * @param fs FootballScore to enter the scores 
	 * @return boolean to tell the main if the user wants to enter more scores
	 * Method Description: Takes the user input to enter into fs
	 */
	private boolean enterScores(FootballScore fs) {

		Scanner input = new Scanner(System.in);

		// Prompts the user to input the score for the home team for game number(index)

		System.out.println("Please enter the home team's score for game " + index + ". Enter a negative number to quit.");

		// Default values

		int home = 0;
		int visitor = 0;
		boolean test = true;

		try {

			// Reads in the user input

			home = input.nextInt();

			if (home < 0) { // If the user inputs a negative number then return false

				return false;
			}

			while (test) { // While the user inputs a negative number keep prompting for the user to enter a positive number

				System.out.println("Please enter the visitor's score for game " + index + ".");

				// Reads in the user input

				visitor = input.nextInt();

				if (visitor > 0) { // The user inputs a positive number then move on

					test = false;

				} else { // Otherwise ask the user to enter a positive number

					System.out.println("Please enter a positive number");
				}
			}

			fs.enterScore(home, visitor);

			index++;

		} catch (InputMismatchException ime) { // If the user inputs something other than a number then just eat the exception and try again

		}

		return true;
	}

	/**
	 * Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		FootballTester ft = new FootballTester();
		FootballScore fs = new FootballScore();

		// Loops based on the boolean return of enterScores() to allow multiple entries
		
		while (ft.enterScores(fs));

		// Outputs the games to the JOptionPane
		
		JOptionPane.showMessageDialog(null, fs.toString());

		System.exit(0);
	}

}
