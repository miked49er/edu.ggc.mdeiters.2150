
package edu.ggc.mdeiters.LinkedLists;

/** Class: MyLinkList
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
public class MyLinkList {

	private MyLinkNode currentNode;

	public MyLinkList() {

		this.currentNode = new MyLinkNode();
	}

	public void add(String word) {

		currentNode = getLast();

		if (currentNode.getCurrentWord() == null) {

			currentNode.setCurrentWord(word);
		}
		else {

			MyLinkNode newNode = new MyLinkNode();
			currentNode.setNext(newNode);
			newNode.setPrevious(currentNode);
			currentNode = newNode;
			currentNode.setCurrentWord(word);
		}
	}

	public void addFirst(String word) {

		currentNode = getFirst();

		if (currentNode.getCurrentWord() == null) {

			currentNode.setCurrentWord(word);
		}
		else {

			MyLinkNode newNode = new MyLinkNode();
			currentNode.setPrevious(newNode);
			newNode.setNext(currentNode);
			currentNode = newNode;
			currentNode.setCurrentWord(word);
		}
	}

	public boolean hasNext() {

		boolean next = false;

		if (currentNode.getNext() != null) {

			next = true;
		}

		return next;
	}

	public boolean hasPrevious() {

		boolean previous = false;

		if (currentNode.getPrevious() != null) {

			previous = true;
		}

		return previous;

	}

	public MyLinkNode getLast() {

		MyLinkNode last = currentNode;

		while (hasNext()) {

			currentNode = currentNode.getNext();
		}

		last = currentNode;

		return last;
	}

	public MyLinkNode getFirst() {

		MyLinkNode first = currentNode;

		while (hasPrevious()) {

			currentNode = currentNode.getPrevious();
		}

		first = currentNode;

		return first;
	}

	@Override
	public String toString() {

		String result = "";
		currentNode = getFirst();

		while (hasNext()) {

			result += currentNode.getCurrentWord() + "\n";
			currentNode = currentNode.getNext();
		}

		result += getLast().getCurrentWord();

		return result;
	}

}
