
package edu.ggc.mdeiters.IC8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/** Class: LinkedListTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 2, 2015
 * 
 * Class Description: Practice using LinkedList and ListIterator
 * 
 * Purpose: Create a list of names, add more in the middle of the list, and sort the list
 * 
 */
public class LinkedListTester {

	/**
	 * Method: printList 
	 * @param list generic LinkedList
	 * @return void
	 * Method Description: print the contents of list
	 */
	private <T> void printList(LinkedList<T> list) {

		for (T str : list) {

			System.out.println(str);
		}
		
		System.out.print("\n");
	}

	/** Method: main 
	 * @param args
	 * Method Description: Create a list of names, add more in the middle of the list, and sort the list
	 */
	public static void main(String[] args) {

		LinkedListTester llt = new LinkedListTester();
		LinkedList<String> list = new LinkedList<String>();

		list.addFirst("Mike");
		list.addFirst("Tim");
		list.addLast("Hannah");
		list.addLast("Taylor");

		llt.printList(list);

		ListIterator<String> iterator = list.listIterator();

		if (iterator.hasNext()) {

			iterator.next();
		}

		iterator.add("Timmy");
		iterator.add("Lexi");

		llt.printList(list);

		Collections.sort(list);

		llt.printList(list);
	}

}
