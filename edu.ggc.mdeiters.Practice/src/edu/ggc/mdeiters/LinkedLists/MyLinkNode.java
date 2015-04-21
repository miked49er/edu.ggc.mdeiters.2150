
package edu.ggc.mdeiters.LinkedLists;

/** Class: MyLinkNode
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
public class MyLinkNode {

	private MyLinkNode nextNode;
	private MyLinkNode previousNode;
	private String currentWord;

	public MyLinkNode() {

		this.nextNode = null;
		this.previousNode = null;
		this.currentWord = null;
	}

	public MyLinkNode getNext() {

		return nextNode;
	}

	public void setNext(MyLinkNode nextNode) {

		this.nextNode = nextNode;
	}

	public MyLinkNode getPrevious() {

		return previousNode;
	}

	public void setPrevious(MyLinkNode previousNode) {

		this.previousNode = previousNode;
	}

	public String getCurrentWord() {

		return currentWord;
	}

	public void setCurrentWord(String currentWord) {

		this.currentWord = currentWord;
	}

}
