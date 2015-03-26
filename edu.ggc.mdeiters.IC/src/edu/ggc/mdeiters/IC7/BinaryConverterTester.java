
package edu.ggc.mdeiters.IC7;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Class: BinaryConverterTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 25, 2015
 * 
 * Class Description: Allows the user to convert numbers to binary
 * 
 * Purpose: Convert numbers to binary
 * 
 */
public class BinaryConverterTester {

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		BinaryConverter bc = new BinaryConverter();
		Scanner input = new Scanner(System.in);
		boolean notDone = true;
		int convert;

		while (notDone) { // Allows the user to enter as many numbers to convert to binary as they want

			System.out.println("Please enter the number you would like to convert to binary (must be a positive integer) leave empty to exit");

			try {

				// Reads the user's input to a string

				String in = input.nextLine();

				if (in.isEmpty()) { // Test to see if there is nothing in the input

					// Stops the loop

					notDone = false;
				}
				else { // If their something in the input

					// Parse the string to an int

					convert = Integer.parseInt(in);
					System.out.println("The binary conversion of " + convert + " is " + bc.binary(convert));
				}
			}
			catch (InputMismatchException ime) { // If a letter is in the input catch the exception

				// Just let them try again

				input.nextLine();
			}

		}
	}
}
