
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;
import java.util.Collections;

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
public class Hand {

	private ArrayList<Card> hand;

	/**
	 * Constructor: Hand
	 * @throws InvalidCardException
	 *
	 */
	public Hand() throws InvalidCardException {

		this.hand = new ArrayList<Card>();
	}

	/**
	 * Constructor: Hand
	 * @param spades
	 * @param hearts
	 * @param diamonds
	 * @param clubs
	 * Purpose: Create a hand with the each suit of the eight card
	 */
	public Hand(Card spades, Card hearts, Card diamonds, Card clubs) {

		this.hand = new ArrayList<Card>();

		hand.add(spades);
		hand.add(hearts);
		hand.add(diamonds);
		hand.add(clubs);
	}

	/**
	 * Method: addCard 
	 * @param deck CardDeck
	 * @return void
	 * Method Description: Deals a card to the player's hand
	 * @throws InvalidCardException 
	 */
	public void addCard(CardDeck deck) throws InvalidCardException {

		this.hand.add(deck.deal());
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
	 * Method: sortCards 
	 * @return void
	 * Method Description: Sort the hand by suit and card value
	 */
	public void sortCards() {

		Collections.sort(hand, new HandComparitor());
	}

	/**
	 * Method: isInHand 
	 * @param card Card to look for in hand
	 * @return isInHand Boolean
	 * Method Description: Checks to see if the card is in the player's hand
	 */
	public boolean isInHand(Card card) {

		boolean isInHand = false;

		for (int i = 0; !isInHand && i < hand.size(); i++) { // Loops through hand to see if the card is in the player's hand

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
