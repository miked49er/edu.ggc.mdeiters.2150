
package edu.ggc.mdeiters.Final;

import java.util.Scanner;

/**
 * Class: LetterPyramid
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: May 7, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 *
 */

public class LetterPyramid {

	public String letterPyramid(String str) {

		if (str.length() == 1) {

			return str;
		}

		String str2 = letterPyramid(str.substring(0, str.length() - 1));

		System.out.println(str2);
		str2 += str.charAt(str.length() - 1);
		return str2;
	}

	public static void main(String[] args) {

		LetterPyramid lp = new LetterPyramid();
		Scanner input = new Scanner(System.in);
		boolean notDone = true;

		while (notDone) {

			System.out.println("Please enter the String to be tested");
			String str = input.nextLine();

			if (!str.isEmpty()) {

				System.out.println(lp.letterPyramid(str));
				notDone = false;
			} else {

				System.out.println("The empty String cannot be used for this problem");
				input.nextLine();
			}
		}
	}

}
