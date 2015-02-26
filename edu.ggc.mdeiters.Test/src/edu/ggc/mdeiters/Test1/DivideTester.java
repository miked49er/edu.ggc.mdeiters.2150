
package edu.ggc.mdeiters.Test1;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Class: DivideTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 26, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class DivideTester {

	public static void main(String[] args) {

		Divider div = new Divider();
		int[] first = { 5, 4, 2, 4, 0 };
		int[] second = { 2, 3, 8, 0, 5 };
		double result = 0;
		boolean error = false;

		for (int i = 0; i < first.length; i++) {
			try {
				result = div.division(first[i], second[i]);

			} catch (InvalidDivideException ide) {

				System.out.println(ide.getMessage());
				error = true;
			}
			if (!error) {
				
				System.out.println("The result of " + first[i] + " divided by " + second[i] + " is " + result);
			} else {
				
				error = false;
			}
		}
	}

}
