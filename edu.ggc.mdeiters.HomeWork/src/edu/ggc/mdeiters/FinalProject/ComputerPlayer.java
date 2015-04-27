
package edu.ggc.mdeiters.FinalProject;

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

	/**
	 * Constructor: ComputerPlayer
	 * @throws InvalidCardException
	 *
	 */
	public ComputerPlayer() throws InvalidCardException {

		this.cardValues = new Card();
		this.cardToPlay = null;
		this.onPile = null;
	}

	/**
	 * Method: nextMove 
	 * @param onPile DiscardPile
	 * @param deck CardDeck
	 * @return Card to be played
	 * @throws Exception
	 * Method Description: Calculates the computer's next move
	 */
	public Card nextMove(DiscardPile onPile, CardDeck deck) throws Exception {

		// Assigns the top card of onPile to onPile

		this.onPile = onPile.getTopCard();

		while (!getGameRules().canPlay(getPlayerHand(), this.onPile)) { // Draw a card until the computer can play

			onPile.refreshDeck(deck);
			drawCard(deck);
		}

		// Resets the cardToPlay value

		cardToPlay = null;

		for (int i = 0; cardToPlay == null && i < getPlayerHand().getHand().size(); i++) { // Loops through the computer's hand to find one that can be played

			if (getPlayerHand().getHand().get(i).getSuit() == this.onPile.getSuit()) { // If the card is the same suit as onPile then assign to cardToPlay 

				cardToPlay = getPlayerHand().getHand().get(i);
			}
			else if (getPlayerHand().getHand().get(i).getValue() == this.onPile.getValue()) { // If the card has the same value as onPile then assign to cardToPlay 

				cardToPlay = getPlayerHand().getHand().get(i);
			}
			else if (getPlayerHand().getHand().get(i).getValue() == 8) { // If the card is an 8s then assign to cardToPlay 

				cardToPlay = getPlayerHand().getHand().get(i);
			}
		}

		if (cardToPlay.getValue() == 8) { // If the card is an 8 then change the suit

			cardToPlay = changeSuit();
		}
		if (playCard(cardToPlay, this.onPile)) { // Check to ensure that the card can be played

			return cardToPlay;
		}

		return null;
	}

	/**
	 * Method: changeSuit 
	 * @return Card
	 * @throws InvalidCardException
	 * Method Description: Calculates how many of each suit the computer has and changes the suit of the 8 to the suit that the computer has the most of
	 */
	private Card changeSuit() throws InvalidCardException {

		// Default of suitToPlay

		Card suitToPlay = new Card(cardValues.SPADES, 8);

		// Assigns getPlayerHand() to hand

		Hand hand = getPlayerHand();

		// Card Array of the different suits of the 8 card

		Card[] eights = { new Card(cardValues.SPADES, 8), new Card(cardValues.HEARTS, 8), new Card(cardValues.DIAMONDS, 8), new Card(cardValues.CLUBS, 8) };

		// Initial values of each suit

		int spades = 0;
		int hearts = 0;
		int diamonds = 0;
		int clubs = 0;

		for (int i = 0; i < hand.getHand().size(); i++) { // Loop through the computer's hand

			if (hand.getHand().get(i).getSuit() == cardValues.SPADES) { // If the card is a spade add 1 to spades

				spades++;
			}
			else if (hand.getHand().get(i).getSuit() == cardValues.HEARTS) { // If the card is a heart add 1 to hearts

				hearts++;
			}
			else if (hand.getHand().get(i).getSuit() == cardValues.DIAMONDS) { // If the card is a diamond add 1 to diamonds

				diamonds++;
			}
			else if (hand.getHand().get(i).getSuit() == cardValues.CLUBS) { // If the card is a club add 1 to clubs

				clubs++;
			}
		}

		// Array of the quantities of each suit

		int[] suits = { spades, hearts, diamonds, clubs };

		// Default value of most

		int most = spades;

		for (int i = 0; i < suits.length; i++) { // Loop through the suits array to find the highest number

			if (suits[i] > most) { // If suits[i] has a greater value than most then assign it to most

				most = suits[i];
			}
		}

		for (int i = 0; i < suits.length; i++) { // Loop through the suits array to find which suit was the highest

			if (most == suits[i]) { // If most is equivalent to suits[i] then assign eights[i] to suitToPlay

				suitToPlay = eights[i];
			}
		}

		return suitToPlay;
	}
}