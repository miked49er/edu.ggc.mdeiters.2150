
package edu.ggc.mdeiters.Recursion;

/** Class: TriangleTester
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
public class TriangleTester {

	/** Method: main 
	 * @param args
	 * Method Description: Tester
	 */
	public static void main(String[] args) {

		Triangle tri = new Triangle();

		System.out.println("The area of the triangle in this class is " + tri.getArea(3));
		System.out.println("The area of the triangle in this class is " + tri.getArea(10));
		System.out.println("The area of the triangle in this class is " + tri.getArea(50));

	}

}
