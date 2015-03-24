
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

	private int getArea(int base) {

		if (base == 0) {

			return 0;

		} else if (base == 1) {

			return 1;
		}

		int area = getArea(base - 1);
		area += base;

		return area;
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		TriangleTester tri = new TriangleTester();

		System.out.println("The area of the triangle in this class is " + tri.getArea(3));
		System.out.println("The area of the triangle in this class is " + tri.getArea(10));
		System.out.println("The area of the triangle in this class is " + tri.getArea(50));

	}

}
