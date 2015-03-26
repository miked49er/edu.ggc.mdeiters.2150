package edu.ggc.mdeiters.Recursion;


/** Class: Triangle
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 25, 2015
 * 
 * Class Description: Find the area of a triangle
 * 
 * Purpose: Use recursion to determine the area of a triangle
 * 
 */
public class Triangle {

	/**
	 * Method: getArea 
	 * @param base Int of the levels of the triangle
	 * @return area the Int of the area of the triangle
	 * Method Description: Recursively finds the area of the triangle
	 */
	public int getArea(int base) {

		if (base == 0) {

			return 0;

		} else if (base == 1) {

			return 1;
		}

		int area = getArea(base - 1);
		area += base;

		return area;
	}
}
