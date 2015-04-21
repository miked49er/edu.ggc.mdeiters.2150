
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;
import java.util.Stack;

/** Class: DiscardPile
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 18, 2015
 * 
 * Class Description: Places the played cards in a separate pile from the deck
 * 
 * Purpose: Handle the discard pile's functions
 * 
 */
public class DiscardPile extends CardDeck {

	private Stack<Card> discardPile;

	/** Constructor: DiscardPile
	 * @throws InvalidCardException
	 */
	public DiscardPile() throws InvalidCardException {

		this.discardPile = new Stack<Card>();
	}

	/**
	 * Method: getTopCard 
	 * @return the Card on top of discardPile
	 * Method Description: This will peek at the top card on discardPile and return it
	 */
	public Card getTopCard() {

		return discardPile.peek();
	}

	/**
	 * Method: addCard 
	 * @param card
	 * Method Description: Pushes card to discardPile
	 */
	public void addCard(Card card) {

		discardPile.push(card);
	}

	/**
	 * Method: refreshDeck 
	 * @return void
	 * Method Description: Keeps the top card of the discard pile. The returns the rest of the cards to the card deck and shuffle's them
	 * @throws Exception 
	 */
	public void refreshDeck() throws Exception {

		// Holds the first card of the discardPile to place back in discardPile

		Card hold = this.discardPile.pop();
		ArrayList<Card> deck = new ArrayList<Card>();

		for (int i = 0; i < discardPile.size(); i++) { // Removes each card from discardPile and adds it to the new deck

			deck.add(discardPile.pop());
		}

		rebuildDeck(deck);

		if (!shuffle()) {

			throw new Exception("Rebuilt deck, but was unable to shuffle.");
		}

		addCard(hold);
	}

}
