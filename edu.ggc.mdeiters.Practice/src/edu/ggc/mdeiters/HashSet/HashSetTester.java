
package edu.ggc.mdeiters.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Class: HashSetTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 23, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 *
 */
public class HashSetTester {

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		PrintHashSet print = new PrintHashSet();

		ArrayList<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("Taylor");
		names.add("Sims");
		names.add("Anthony");
		names.add("Devian");
		names.add("Sir Fruitcup the Tasty of Waho");

		HashSet<String> theSet = new HashSet<String>();
		theSet.addAll(names);

		print.printHashSet(theSet);

		HashSet<Integer> intSet = new HashSet<Integer>();
		intSet.add(100);
		intSet.add(3);
		intSet.add(205);
		intSet.add(562);
		intSet.add(1);

		print.printHashSet(intSet);
	}

}
