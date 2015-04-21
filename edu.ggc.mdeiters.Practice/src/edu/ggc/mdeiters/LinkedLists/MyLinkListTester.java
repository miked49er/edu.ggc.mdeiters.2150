
package edu.ggc.mdeiters.LinkedLists;

/** Class: MyLinkListTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 21, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class MyLinkListTester {

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		MyLinkList list = new MyLinkList();

		list.add("first");
		list.add("second");
		list.addFirst("thrown in first");
		list.add("third");

		System.out.println(list.toString());
	}

}
