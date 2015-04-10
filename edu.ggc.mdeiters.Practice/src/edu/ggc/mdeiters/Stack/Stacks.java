
package edu.ggc.mdeiters.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/** Class: Stacks
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
public class Stacks {

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		Stack<String> sta = new Stack<String>();
		
		String jim = "Jim";
		String tom = "Tom";
		String sarah = "Sarah";
		String tiffany = "Tiffany";

		sta.push(jim);
		sta.push(tom);
		sta.push(sarah);
		sta.push(tiffany);

		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());

		System.out.println("\n");

		Queue<String> que = new LinkedList<String>();

		que.add(jim);
		que.add(tom);
		que.add(sarah);
		que.add(tiffany);

		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());

		System.out.println("\n");

		String test = "What Im Doing";
		System.out.println(test.length());

		for (int i = 0; i < test.length(); i++) {

			sta.push(test.substring(i, i + 1));
		}

		String result = "";
		System.out.println(sta.size());

		while (!sta.isEmpty()) {

			result += sta.pop();
		}

		System.out.println(result);

		System.out.println("\n");

		NameComparitor nc = new NameComparitor();
		QueueList<String> pql = new QueueList<String>(nc);
		String[] nameList = { tom, sarah, jim, tiffany };

		pql.addItems(nameList);
		pql.printQueue();
	}

}
