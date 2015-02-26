
package edu.ggc.mdeiters.Test1;

/** Class:Divider
 * @author ITEC 2150
 * version 1.0
 * Course: ITEC 2150 Spring 2015
 * Written: February 25, 2015
 * This class - This class provides the shell for the division operations specified for test 1
 * Purpose:- The purpose of the class is use exceptions
 */

public class Divider {

	public double division(int first, int second) throws InvalidDivideException {

		if (second == 0) {
			throw new InvalidDivideException("Attempted to divide by 0. Problem was " + first + "/" + second);
		} else {
			return (double)first/second;
		}
	}

}
