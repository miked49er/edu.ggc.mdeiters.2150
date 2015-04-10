
package edu.ggc.mdeiters.Stack;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/** Class: PriorityQueueList
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 7, 2015
 * 
 * Class Description: Generic PriorityQueue Class to sort through the queue
 * 
 * Purpose: Implement PriorityQueue in a reusable way
 * 
 */
public class QueueList<T> {

//	private Collection<T> priority;
//
	private PriorityQueue<T> priority;

//
//	public QueueList() {
//
//		this.priority = new LinkedList<T>();
//	}

	public QueueList(Comparator<T> cc) {

		this.priority = new PriorityQueue<T>(cc);
	}

	public void addItems(T[] tList) {

		for (T inT : tList) {

			this.priority.add(inT);
		}
	}

	public void printQueue() {

		while (!priority.isEmpty()) {

			System.out.println(removeT());
		}
	}

	private <T> T removeT() {

		return (T) this.priority.remove();
	}
}
