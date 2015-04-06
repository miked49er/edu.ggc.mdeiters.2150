
package edu.ggc.mdeiters.HomeWork3;

import java.util.ArrayList;

/** Class: ReverseRecTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 31, 2015
 * 
 * Class Description: Tester of ReverseRec class
 * 
 * Purpose: Send a string into ReverseRec to be reversed
 * 
 */
public class ReverseRecTester {

	public static void main(String args[]) {

		ReverseRec rr = new ReverseRec();
		
		// Test String
		
		String test = "This is a test of the reversal call";

		rr.reverseString(test);
		System.out.println(rr.toString());
	}
}
