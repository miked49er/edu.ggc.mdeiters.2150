
package edu.ggc.mdeiters.Stack;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Testing {

	public static void main(String[] args) {

		Testing test = new Testing();
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(3);
		que.add(8);
		que.add(17);
		que.add(9);
		que.add(8);
		que.add(17);
		que.add(8);
		que.add(3);

		System.out.println(test.isPalindrome(que));
	}

	public boolean isPalindrome(Queue<Integer> que) {

		Stack<Integer> sta = new Stack<Integer>();
		ListIterator<Integer> iter = (ListIterator<Integer>) que.iterator();

		while (iter.hasNext()) {

			sta.push((Integer) iter.next());
		}

		while (iter.hasPrevious()) {

			iter.previous();
		}

		boolean palindrome = false;

		if (que.isEmpty() || que.size() == 1) {

			return true;
		}
		if (iter.hasNext()) {

			do {
				if (iter.next() == sta.pop()) {
					palindrome = true;
				} else {
					palindrome = false;
				}
			} while (palindrome && iter.hasNext());
		}
		return palindrome;
	}

}
