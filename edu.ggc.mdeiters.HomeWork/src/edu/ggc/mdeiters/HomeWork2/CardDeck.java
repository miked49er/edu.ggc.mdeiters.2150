
package edu.ggc.mdeiters.HomeWork2;

import java.util.ArrayList;
import java.util.Collections;

/** Class: CardDeck
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 18, 2015
 * 
 * 
 * This will create card instances to form a deck
 * 
 * Purpose is to create a deck of cards
 * 
 */
public class CardDeck extends Card {

	private ArrayList<Card> deck = new ArrayList<Card>();
	private Card dealedCard;

	/**
	 * Constructor
	 * This will create a deck in the order of Spade, Heart, Diamond, Club
	 * 		with each suit in order Ace through King
	 * @throws InvalidCardException
	 */
	public CardDeck() throws InvalidCardException {

		super();
		try {
			for (int i = 0; i <= 3; i++) {

				for (int j = 1; j <= 13; j++) {
					
					deck.add(new Card(i, j));
				}
			}
		} catch (InvalidCardException ice) {
			throw ice;
		}
	}

	/**
	 * Method: shuffle
	 * This will randomize the deck ArrayList to shuffle it
	 * @return boolean
	 */
	public boolean shuffle() {

		try {

			// Shuffles the deck ArrayList

			Collections.shuffle(deck);

		} catch (UnsupportedOperationException uoe) {

			// There was an issue shuffling therefore the deck is not shuffled and return false

			return false;
		}

		// There was no issue shuffling the deck so therefore it is shuffled and return true

		return true;
	}

	/**
	 * Method: deal
	 * This will deal the first card in the deck
	 * @return the top card on the deck
	 */
	public Card deal() {

		// Assigns the top card to dealedCard

		dealedCard = deck.get(0);

		return dealedCard;
	}

	/**
	 * Method: selectCard
	 * This will test to see if the user selected card is within the bounds of the deck
	 * @param cardNumber
	 * @return the user selected card if the card is within the bounds of the deck otherwise it will return the last card in the deck
	 */
	public Card selectCard(int cardNumber) {

		if (cardNumber >= 1 && cardNumber <= 52) { // Return the card selected if cardNumber is between 1 and 52

			return deck.get(cardNumber - 1);

		} else { // Return the last card if cardNumber is greater than 52

			return deck.get(deck.size() - 1);
		}
	}

	/**
	 * Method: printDeck
	 * This will add all of the cards from the deck ArrayList to the cards array
	 * @return the cards array to print
	 */
	public Card[] printDeck() {

		// Card array to hold the cards in the deck

		Card[] cards = new Card[deck.size()];

		for (int i = 0; i < deck.size(); i++) {

			// Adds each element of the deck ArrayList to the array

			cards[i] = deck.get(i);
		}

		return cards;
	}
}
