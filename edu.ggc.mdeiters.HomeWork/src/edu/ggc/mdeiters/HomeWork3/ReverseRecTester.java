
package edu.ggc.mdeiters.HomeWork3;

/** Class: ReverseRecTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 31, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class ReverseRecTester {

	public static void main(String args[]) {

		ReverseRec rr = new ReverseRec();
		String test = "This is a test of the call";
		
//		System.out.println(rr.reverseWords("Test"));
		
		rr.reverseString(test);
		System.out.println(rr.toString());
	}
}
