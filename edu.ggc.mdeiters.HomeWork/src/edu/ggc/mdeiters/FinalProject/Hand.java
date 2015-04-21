
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;

/** Class: Hand
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 9, 2015
 * 
 * Class Description: The players hand
 * 
 * Purpose: To control the player's hand
 * 
 */
public class Hand extends CardDeck {

	private ArrayList<Card> hand;
	private GameRules game;

	/**
	 * Constructor: Hand
	 * @throws InvalidCardException
	 *
	 */
	public Hand() throws InvalidCardException {

		this.hand = new ArrayList<Card>();
		this.game = new GameRules();
	}

	/**
	 * Method: addCard 
	 * @return void
	 * Method Description: Deals a card to the player's hand
	 * @throws InvalidCardException 
	 */
	public void addCard() throws InvalidCardException {

		this.hand.add(deal());
	}

	/**
	 * Method: removeCard 
	 * @param card
	 * @return void
	 * Method Description: Removes a card from the player's hand to be places it in the discardPile
	 */
	public void removeCard(Card card) {

		this.hand.remove(card);
	}

	/**
	 * Method: isInHand 
	 * @param card Card to look for in hand
	 * @return isInHand Boolean
	 * Method Description: Checks to see if the card is in the player's hand
	 */
	public boolean isInHand(Card card) {

		boolean isInHand = false;

		for (int i = 0; !isInHand && i < hand.size(); i++) {

			if (hand.get(i) == card) {

				isInHand = true;
			}
		}

		return isInHand;
	}

	/**
	 * Method: getHand 
	 * @return hand
	 * Method Description: Return an ArrayList of the player's hand
	 */
	public ArrayList<Card> getHand() {

		return this.hand;
	}

}
