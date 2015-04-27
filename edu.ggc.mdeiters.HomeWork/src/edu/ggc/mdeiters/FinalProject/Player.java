
package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;

/** Class: Player
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 9, 2015
 * 
 * Class Description: Game players
 * 
 * Purpose: Handle the player's controls
 * 
 */
public class Player {

	private Hand hand;
	private GameRules game;

	/**
	 * Constructor: Player
	 * @throws InvalidCardException 
	 *
	 */
	public Player() throws InvalidCardException {

		this.hand = new Hand();
		this.game = new GameRules();
	}

	/**
	 * Method: drawCard 
	 * @param deck CardDeck
	 * @return void
	 * @throws InvalidCardException 
	 * Method Description: Draws a card from the top of the deck and places in user's hand
	 */
	public void drawCard(CardDeck deck) throws InvalidCardException {

		hand.addCard(deck);
	}

	/**
	 * Method: playCard 
	 * @param card Card to play
	 * @return boolean If the card was played or not
	 * Method Description: Checks to see if the player can play said card
	 */
	public boolean playCard(Card card, Card onPile) {

		if (game.isValid(hand, card, onPile)) {

			if (card.getValue() == 8) { // If card is an 8 then locate the 8 in player's hand

				// Assigns the hand ArrayList to playerHand

				ArrayList<Card> playerHand = hand.getHand();

				for (int i = 0; i < playerHand.size(); i++) { // Loop through playerHand to find the 8

					if (playerHand.get(i).getValue() == 8) {

						// Assigns the 8 card to card to be removed

						card = playerHand.get(i);
					}
				}
			}

			hand.removeCard(card);
			return true;

		}
		return false;
	}

	/**
	 * Method: getPlayerHand 
	 * @return Hand
	 * Method Description: Return the player's hand
	 */
	public Hand getPlayerHand() {

		return hand;
	}

	/**
	 * Method: getGameRules 
	 * @return GameRules
	 * Method Description: Returns the GameRules variable game
	 */
	public GameRules getGameRules() {

		return game;
	}

}
