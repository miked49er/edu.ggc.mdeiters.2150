
package edu.ggc.mdeiters.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

/** Class: PrintHashSet
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
public class PrintHashSet {

	public <E> void printHashSet(HashSet<E> set) {

		for (E e : set) {

			System.out.println(e + "");
		}
		System.out.println("");
	}

	public <E> void printHashSet(TreeSet<E> set) {

		for (E e : set) {

			System.out.println(e + "");
		}
		System.out.println("");
	}
}
