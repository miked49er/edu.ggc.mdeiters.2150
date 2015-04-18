
package edu.ggc.mdeiters.FinalProject;

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

	/**
	 * Constructor: Player
	 * @throws InvalidCardException 
	 *
	 */
	public Player() throws InvalidCardException {

		this.hand = new Hand();
	}

	/**
	 * Method: drawCard 
	 * @return card Card
	 * Method Description: Draws a card from the top of the deck and places in user's hand
	 */
	public Card drawCard() {

		Card card = new Card();

		return card;
	}

	/**
	 * Method: playCard 
	 * @param card Card to play
	 * @return void
	 * Method Description: Removes a card from the player's hand and places in the discard pile
	 */
	public void playCard(Card card) {

	}

}
