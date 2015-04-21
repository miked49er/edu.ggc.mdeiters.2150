
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
	 * Method: getHand 
	 * @return hand
	 * Method Description: Return an ArrayList of the player's hand
	 */
	public ArrayList<Card> getHand() {

		return this.hand;
	}

}
