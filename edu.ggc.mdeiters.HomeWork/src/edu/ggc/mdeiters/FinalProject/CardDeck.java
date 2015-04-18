
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/** Class: CardDeck
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: Apr 9, 2015
 * 
 * 
 * This will create card instances to form a deck
 * 
 * Purpose is to create a deck of cards
 * 
 */
public class CardDeck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	private Card dealedCard;

	/**
	 * Constructor
	 * This will create a deck in the order of Spade, Heart, Diamond, Club
	 * 		with each suit in order Ace through King
	 * @throws InvalidCardException
	 */
	public CardDeck() throws InvalidCardException {

		for (int i = 0; i <= 3; i++) {

			for (int j = 1; j <= 13; j++) {

				deck.add(new Card(i, j));
			}
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

		}
		catch (UnsupportedOperationException uoe) {

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
	public Card deal() throws InvalidCardException {

		if (!deck.isEmpty()) {

			// Assigns the top card to dealedCard

			dealedCard = deck.get(deck.size() - 1);

			// Removes the top card from the deck

			deck.remove(deck.size() - 1);
		}
		else {

			throw new InvalidCardException("No cards found in deck");
		}

		return dealedCard;
	}

	/**
	 * Method: rebuildDeck 
	 * @param deck ArrayList of Cards
	 * Method Description: Rebuilds the empty deck
	 */
	public void rebuildDeck(ArrayList<Card> deck) {

		this.deck = deck;
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
