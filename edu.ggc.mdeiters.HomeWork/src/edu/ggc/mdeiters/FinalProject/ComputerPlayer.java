
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;

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

	private Card cardValues;
	private Card onPile;
	private Card cardToPlay;
	private ArrayList<Card> spades;
	private ArrayList<Card> hearts;
	private ArrayList<Card> diamonds;
	private ArrayList<Card> clubs;
	private ArrayList<Card> eights;
	ArrayList<Card> suitToPlay;

	/**
	 * Constructor: ComputerPlayer
	 * @throws InvalidCardException
	 *
	 */
	public ComputerPlayer() throws InvalidCardException {

		this.cardValues = new Card();
		this.cardToPlay = null;
		this.onPile = null;
		this.spades = new ArrayList<Card>();
		this.hearts = new ArrayList<Card>();
		this.diamonds = new ArrayList<Card>();
		this.clubs = new ArrayList<Card>();
		this.eights = new ArrayList<Card>();
		this.suitToPlay = new ArrayList<Card>();
	}

	/**
	 * Method: nextMove 
	 * @param onPile
	 * @return the card that the computer decides to play
	 * @throws InvalidCardException 
	 * Method Description: Calculate the best card to play currently
	 */
	public Card nextMove(Card onPile) throws InvalidCardException {

		// Assigns the value of onPile to the global onPile

		this.onPile = onPile;

		while (!getGameRules().canPlay(getPlayerHand(), onPile)) { // Draw a card until the computer can play

			drawCard();
		}

		suits();

		// Creates an ArrayList of the ArrayList of the suits

		ArrayList<ArrayList<Card>> suits = new ArrayList<ArrayList<Card>>();
		suits.add(spades);
		suits.add(hearts);
		suits.add(diamonds);
		suits.add(clubs);

		// Assigns the initial nextSuit return to suit

		Card topSuit = nextSuit(suits);

		for (int i = 0; cardToPlay == null && i < 4; i++) { // Loop until either cardToPlay is found or all 4 suits have be gone through

			if (suitToPlay.get(0).getSuit() == this.onPile.getSuit()) { // If suitToPlay has the same suit as onPile then play the first card in the array

				cardToPlay = suitToPlay.get(0);
			}
			else { // Otherwise calculate which card can be played

				if (!foundCard(suits)) { // If foundCard doesn't find a playable card then remove the suitToPlay suit from the ArrayList suits, and try again

					removeSuit(suits);
					nextSuit(suits);
				}
			}
		}

		if (cardToPlay == null) { // If cardToPlay was never found then check for an eight

			if (eights.size() > 0) { // If there is an 8 then create a new card with the suit value of topSuit

				cardToPlay = new Card(topSuit.getSuit(), 8);
			}
		}

		playCard(cardToPlay, this.onPile);

		return cardToPlay;
	}

	/**
	 * Method: foundCard 
	 * @param suits ArrayList of the ArrayList of suits
	 * @param onPile Card on top of the discard pile
	 * @return foundCard Boolean
	 * Method Description: Searches suitToPlay for a card that has the same value as the value of onPile
	 */
	private boolean foundCard(ArrayList<ArrayList<Card>> suits) {

		// Default value of foundCard

		boolean foundCard = false;

		for (int i = 0; !foundCard && i < suitToPlay.size(); i++) { // Loop until foundCard or gone through suitToPlay

			if (suitToPlay.get(i).getValue() == onPile.getValue()) { // If the value of i index of suitToPlay and onPile, are equal

				// Assign the card to cardToPlay

				cardToPlay = suitToPlay.get(i);

				// Set foundCard to true

				foundCard = true;
			}
		}

		return foundCard;
	}

	/**
	 * Method: removeSuit 
	 * @param suits ArrayList of the ArrayList of suits
	 * Method Description: Removes the suit in the suitToPlay ArrayList from the suits ArrayList
	 */
	private void removeSuit(ArrayList<ArrayList<Card>> suits) {

		// Default value of removeSuit

		boolean removeSuit = false;

		for (int i = 0; !removeSuit && i < suits.size(); i++) { // Loop through until the suit of suitToPlay has been removed from suits

			if (suits.get(i).get(0).getSuit() == suitToPlay.get(0).getSuit()) { // If the suit of suitToPlay is the same as the index of suits then remove it from suits

				suits.remove(i);

				// Set removeSuit to true

				removeSuit = true;
			}
		}
	}

	/**
	 * Method: suits 
	 * @return void
	 * Method Description: Looks at each card to find how many of each suit is in the computer's hand and how many 8's it has
	 */
	private void suits() {

		// Assigns the player's hand to hand

		ArrayList<Card> hand = getPlayerHand().getHand();

		for (int i = 0; i < hand.size(); i++) { // Loop through all of the cards in the player's hand

			if (hand.get(i).getValue() == 8) { // Add the card to eights if it is an 8

				eights.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.SPADES) { // Add the card to spades if the card is a spade

				spades.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.HEARTS) { // Add the card to hearts if the card is a heart

				hearts.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.DIAMONDS) { // Add the card to diamonds if the card is a diamond

				diamonds.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.CLUBS) { // Add the card to clubs if the card is a club

				clubs.add(hand.get(i));
			}
		}

		// Resets the cardToPlay variable

		cardToPlay = null;
	}

	/**
	 * Method: nextSuit 
	 * @return suit Card
	 * Method Description: Finds the ArrayList with the most Cards in it
	 */
	private Card nextSuit(ArrayList<ArrayList<Card>> suits) {

		// Default value of cardSuit

		Card cardSuit = null;

		for (int i = 0; i < suits.size(); i++) { // Loop through the ArrayList of suits

			if (suits.get(i).size() > suitToPlay.size()) { // If the ArrayList is larger then suitToPlay then set suitToPlay to the new ArrayList

				suitToPlay = suits.get(i);

				// Sets the first card of suitToPlay to cardSuit to refer to later

				cardSuit = suitToPlay.get(0);
			}
			else if (suits.get(i).size() == suitToPlay.size() && suits.get(i).get(0).getSuit() == onPile.getSuit()) { // If the ArrayList and suitToPlay is the same size and the same suit as onPile then set suitToPlay to the new ArrayList

				suitToPlay = suits.get(i);
			}
		}

		return cardSuit;
	}

}
