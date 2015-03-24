
package edu.ggc.mdeiters.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Class: BinaryConverter
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 24, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class BinaryConverter {

	private String binary(int num) {

		if (num == 0) {

			return "0";
		}
		else if (num == 1) {

			return "1";
		}

		String str = binary(num / 2);
		str += (num % 2);
		return str;

	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		BinaryConverter bc = new BinaryConverter();
		Scanner input = new Scanner(System.in);
		boolean notDone = true;
		int convert;

		while (notDone) {
			System.out.println("Please enter the number you would like to convert to binary (must be a positive integer) -1 to exit");

			try {

				convert = input.nextInt();

				if (convert == -1) {

					notDone = false;
				}
				else if (convert < 0) {

				}
				else {

					System.out.println("The binary conversion of " + convert + " is " + bc.binary(convert));
				}
			}
			catch (InputMismatchException ime) {

				input.nextLine();
			}

		}
	}
}
