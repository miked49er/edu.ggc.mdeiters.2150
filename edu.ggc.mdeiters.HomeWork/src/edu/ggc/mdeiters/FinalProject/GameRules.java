
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;

/** Class: GameRules
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 9, 2015
 * 
 * Class Description: Game Rules
 * 
 * Purpose: Controls the game play of Crazy 8's
 * 
 */
public class GameRules {

	private final int STARTINGHAND;

	/**
	 * Constructor: GameRules
	 * @throws InvalidCardException 
	 *
	 */
	public GameRules() throws InvalidCardException {

		this.STARTINGHAND = 8;
	}

	/**
	 * Method: canPlay 
	 * @param hand The player's hand
	 * @return canPlay boolean
	 * Method Description: checks to see if the player can play from their hand
	 */
	public boolean canPlay(Hand hand) {

		// Creates a boolean for testing if the player can play

		Boolean canPlay = false;

		// Gets the top card of the discard pile to compare to the player's hand

		Card onPile = discard.getTopCard();

		// Retrieves the player's hand

		ArrayList<Card> playerHand = hand.getHand();

		for (int i = 0; !canPlay && i < playerHand.size(); i++) { // Loops through playerHand until either a playable card is found or the last card of the hand

			if (playerHand.get(i).getSuit() == onPile.getSuit()) { // If the suit of card i is the same as the suit of onPile, then set canPlay to true

				canPlay = true;
			}
			else if (playerHand.get(i).getValue() == onPile.getValue()) { // Else if the value of the card is the same as the value of onPile, then set canPlay to true

				canPlay = true;
			}
			else if (playerHand.get(i).getValue() == 8) { // Else if the card is an 8, then set canPlay to true

				canPlay = true;
			}
		}

		return canPlay;
	}

	/**
	 * Method: isValid 
	 * @param card Card that the player is trying to play
	 * @return isValid boolean
	 * Method Description: Verifies to ensure that the player is making a legal play
	 */
	public boolean isValid(Card card) {

		// Creates a boolean for testing if the player is making a legal play

		boolean isValid = false;

		// Gets the top card of the discard pile to compare to the player's hand

		Card onPile = discard.getTopCard();

		if (card.getSuit() == onPile.getSuit()) { // If the suit of card is the same as the suit of onPile, then set isValid to true

			isValid = true;
		}
		else if (card.getValue() == onPile.getValue()) { // Else if the value of the card is the same as the value of onPile, then set isValid to true

			isValid = true;
		}
		else if (card.getValue() == 8) { // Else if the card is an 8, then set isValid to true

			isValid = true;
		}

		return isValid;
	}

	/**
	 * Method: getStartingHand 
	 * @return startingHand int
	 * Method Description: Returns the starting size of the player's hands
	 */
	public int getStartingHand() {

		return this.STARTINGHAND;
	}

	/**
	 * Method: isHasWon 
	 * @param player Player of game
	 * @return hasWon boolean
	 * Method Description: Checks to see if a player has won
	 */
	public boolean hasWon() {

		return hasWon;
	}

	/**
	 * Method: toString
	 * @return str String
	 * Method Description: Outputs the game's rules as text
	 */
	public String toString() {

		String str = "";
		return str;
	}

}
