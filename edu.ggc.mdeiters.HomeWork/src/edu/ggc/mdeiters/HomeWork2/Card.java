
package edu.ggc.mdeiters.HomeWork2;

/** Class: Card
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 17, 2015
 * 
 * 
 * This will create instances of playing cards
 * 
 * Purpose is to create a cards for a deck of cards
 * 
 */
public class Card {

	// Default values for the suits

	private final int SPADES = 0;
	private final int HEARTS = 1;
	private final int DIAMONDS = 2;
	private final int CLUBS = 3;

	// Default values for the face cards

	private final int ACE = 1;
	private final int JACK = 11;
	private final int QUEEN = 12;
	private final int KING = 13;

	private int suit; // Int that is between 0 and 3 to decide the suit of the card
	private int value; // Int that is between 1 and 13 to decide the value of the card

	public Card() {

	}

	/**
	 * Constructor
	 * This will create the cards
	 * @param suit
	 * @param value
	 * @throws InvalidCardException if the suit int is not between 0 and 3 or if the value int is not between 1 and 13
	 */
	public Card(int suit, int value) throws InvalidCardException {

		// Test to make sure that the suit value is between 0 and 3 to identify a card suit

		if (suit >= 0 && suit <= 3) {
			this.suit = suit;
		} else {
			throw new InvalidCardException("Not a valid card suit");
		}

		// Test to make sure that the value is between 1 and 13 to identify a card value

		if (value >= 1 && value <= 13) {
			this.value = value;
		} else {
			throw new InvalidCardException("Not a valid card value");
		}

	}

	/**
	 * Method: getSuit
	 * @return the suit as an int
	 */
	public int getSuit() {

		return suit;
	}

	/**
	 * Method: getValue
	 * @return the value as an int
	 */
	public int getValue() {

		return value;
	}

	/**
	 * Method: getSuitAsString
	 * This will convert the suit in to the string of the suit
	 * @return the suit as a string
	 */
	public String getSuitAsString() {

		switch (this.suit) {
			case SPADES:
				return "Spades";
			case HEARTS:
				return "Hearts";
			case DIAMONDS:
				return "Diamonds";
			case CLUBS:
				return "Clubs";
			default:
				return "??";
		}
	}

	/**
	 * Method: getValueAsString
	 * This will convert the value to a string
	 * @return the value as a string
	 */
	public String getValueAsString() {

		switch (this.value) {
			case ACE:
				return "Ace";
			case 2:
				return "2";
			case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 8:
				return "8";
			case 9:
				return "9";
			case 10:
				return "10";
			case JACK:
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING:
				return "King";
			default:
				return "??";
		}
	}

	/**
	 * Method: toString
	 * @return the card's suit and value
	 */
	public String toString() {

		return getValueAsString() + " of " + getSuitAsString();
	}

}
