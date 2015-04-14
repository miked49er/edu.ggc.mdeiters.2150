
package edu.ggc.mdeiters.FinalProject;

import java.util.Queue;

/**
 * Class: ComputerPlayer
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 14, 2015
 * 
 * Class Description: Controls the computer player's actions
 * 
 * Purpose: Defines how the computer player plays
 *
 */
public class ComputerPlayer extends Player {

	private int numOfSpades;
	private int numOfHearts;
	private int numOfDiamonds;
	private int numOfClubs;
	private int numOfEights;
	private Queue<Card> que;

	/**
	 * Constructor: ComputerPlayer
	 *
	 */
	public ComputerPlayer() {

	}

	/**
	 * Method: calculateBestPlay 
	 * @param card
	 * @return the card that the computer decides to play
	 * Method Description: Calculate the best card to play currently and also line up the rest of the cards in its hand for future plays
	 */
	public Card calculateBestPlay(Card card) {

		return null;
	}

	/**
	 * Method: suits 
	 * @return void
	 * Method Description: Looks at each card to find how many of each suit is in the computer's hand and how many 8's it has
	 */
	private void suits() {

	}

	/**
	 * Method: addToQue 
	 * @param card
	 * @return void
	 * Method Description: Adds card to the computer's hand que 
	 */
	private void addToQue(Card card) {

	}

	/**
	 * Method: rebuildHand 
	 * @return void
	 * Method Description: Removes each card in the que and places back into the computer's hand
	 */
	private void rebuildHand() {

	}

}
