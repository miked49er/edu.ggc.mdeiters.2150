
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
	private ArrayList<Card> spades;
	private ArrayList<Card> hearts;
	private ArrayList<Card> diamonds;
	private ArrayList<Card> clubs;
	private ArrayList<Card> eights;
	ArrayList<Card> longestList;

	/**
	 * Constructor: ComputerPlayer
	 * @throws InvalidCardException
	 *
	 */
	public ComputerPlayer() throws InvalidCardException {

		this.cardValues = new Card();
		this.spades = new ArrayList<Card>();
		this.hearts = new ArrayList<Card>();
		this.diamonds = new ArrayList<Card>();
		this.clubs = new ArrayList<Card>();
		this.eights = new ArrayList<Card>();
		this.longestList = new ArrayList<Card>();
	}

	/**
	 * Method: nextMove 
	 * @param onPile
	 * @return the card that the computer decides to play
	 * Method Description: Calculate the best card to play currently
	 */
	public Card nextMove(Card onPile) {

		Card cardToPlay = new Card();
		suits();

		ArrayList<ArrayList<Card>> suits = new ArrayList<ArrayList<Card>>();
		suits.add(spades);
		suits.add(hearts);
		suits.add(diamonds);
		suits.add(clubs);

		nextSuit(onPile, suits);

		if (longestList.get(0).getSuit() == onPile.getSuit()) {

		}
		else {

			boolean foundCard = false;

			for (int i = 0; !foundCard && i < longestList.size(); i++) {

				if (longestList.get(i).getValue() == onPile.getValue()) {

					cardToPlay = longestList.get(i);
					foundCard = true;
				}
			}

			if (foundCard) {

				playCard(cardToPlay, onPile);
			}
			else {

				boolean foundSuit = false;

				for (int i = 0; !foundSuit && i < suits.size(); i++) {

					if (suits.get(i).get(0).getSuit() == longestList.get(0).getSuit()) {
						
						suits.remove(i);
					}
				}
				
				
			}
		}

		return null;
	}

	/**
	 * Method: suits 
	 * @return void
	 * Method Description: Looks at each card to find how many of each suit is in the computer's hand and how many 8's it has
	 */
	private void suits() {

		ArrayList<Card> hand = getPlayerHand().getHand();

		for (int i = 0; i < hand.size(); i++) {

			if (hand.get(i).getValue() == 8) {

				eights.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.SPADES) {

				spades.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.HEARTS) {

				hearts.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.DIAMONDS) {

				diamonds.add(hand.get(i));
			}
			else if (hand.get(i).getSuit() == cardValues.CLUBS) {

				clubs.add(hand.get(i));
			}
		}
	}

	/**
	 * Method: nextSuit 
	 * @return void
	 * Method Description: Finds the ArrayList with the most Cards in it
	 */
	private void nextSuit(Card onPile, ArrayList<ArrayList<Card>> suits) {

		for (int i = 0; i < suits.size(); i++) {

			if (suits.get(i).size() > longestList.size()) { // If the ArrayList is larger then longestList then set longestList to the new ArrayList

				longestList = suits.get(i);
			}
			else if (suits.get(i).size() == longestList.size() && suits.get(i).get(0).getSuit() == onPile.getSuit()) { // If the ArrayList and longestList is the same size and the same suit as onPile then set longestList to the new ArrayList

				longestList = suits.get(i);
			}
		}
	}

}
