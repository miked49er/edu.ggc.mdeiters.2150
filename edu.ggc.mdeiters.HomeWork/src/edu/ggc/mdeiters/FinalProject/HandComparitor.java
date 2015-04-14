
package edu.ggc.mdeiters.FinalProject;

import java.util.Comparator;

/**
 * Class: HandComparitor
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 14, 2015
 * 
 * Class Description: Compares 2 card values to determine the proper order 
 * 
 * Purpose: Sort cards from Spade Ace to Club King
 *
 */
public class HandComparitor implements Comparator<Card> {

	/**
	 * Method: compare
	 * @param card1
	 * @param card2
	 * @return difference between the card's value
	 * Method Description: Order the cards Spade to Club and Ace to King
	 */
	public int compare(Card card1, Card card2) {

		// Multiplies the card suit value by 100 and adds the card value. This allows for the cards to be sorted by suit and card value

		int c1 = (card1.getSuit() * 100) + card1.getValue();
		int c2 = (card2.getSuit() * 100) + card2.getValue();

		return c1 - c2;
	}

}
