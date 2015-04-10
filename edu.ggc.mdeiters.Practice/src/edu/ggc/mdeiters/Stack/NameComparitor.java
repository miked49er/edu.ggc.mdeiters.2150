package edu.ggc.mdeiters.Stack;

import java.util.Comparator;


/** Class: NameComparitor
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 7, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class NameComparitor implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return str1.compareTo(str2);
	}

}
