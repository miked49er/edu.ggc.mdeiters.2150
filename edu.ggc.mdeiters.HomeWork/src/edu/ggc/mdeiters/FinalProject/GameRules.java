
package edu.ggc.mdeiters.FinalProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
	 * @param onPile the top card of the discard pile
	 * @return canPlay boolean
	 * Method Description: checks to see if the player can play from their hand
	 */
	public boolean canPlay(Hand hand, Card onPile) {

		// Creates a boolean for testing if the player can play

		Boolean canPlay = false;

		// Retrieves the player's hand

		ArrayList<Card> playerHand = hand.getHand();

		for (int i = 0; !canPlay && i < playerHand.size(); i++) { // Loops through playerHand until either a playable card is found or the last card of the hand

			if (playerHand.get(i).getValue() == 8) { // if the card is an 8, then set canPlay to true

				canPlay = true;
			}
			else if (playerHand.get(i).getSuit() == onPile.getSuit()) { // If the suit of card i is the same as the suit of onPile, then set canPlay to true

				canPlay = true;
			}
			else if (playerHand.get(i).getValue() == onPile.getValue()) { // if the value of the card is the same as the value of onPile, then set canPlay to true

				canPlay = true;
			}
		}

		return canPlay;
	}

	/**
	 * Method: isValid 
	 * @param hand The player's hand
	 * @param card Card that the player is trying to play
	 * @param onPile the top card of the discard pile
	 * @return isValid boolean
	 * Method Description: Verifies to ensure that the player is making a legal play
	 */
	public boolean isValid(Hand hand, Card card, Card onPile) {

		// Creates a boolean for testing if the player is making a legal play

		boolean isValid = false;

		if (hand.isInHand(card)) {

			if (card.getValue() == 8) { // if the card is an 8, then set isValid to true

				isValid = true;
			}
			else if (card.getSuit() == onPile.getSuit()) { // If the suit of card is the same as the suit of onPile, then set isValid to true

				isValid = true;
			}
			else if (card.getValue() == onPile.getValue()) { // if the value of the card is the same as the value of onPile, then set isValid to true

				isValid = true;
			}
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
	 * @param hand The player's hand
	 * @return hasWon boolean
	 * Method Description: Checks to see if a player has won
	 */
	public boolean hasWon(Hand hand) {

		// Creates a boolean for testing if the player has won

		boolean hasWon = false;

		// Retrieves the player's hand

		ArrayList<Card> playerHand = hand.getHand();

		if (playerHand.isEmpty()) {

			hasWon = true;
		}

		return hasWon;
	}

	/**
	 * Method: toString
	 * @return str String
	 * Method Description: Outputs the game's rules as text
	 */
	public String toString() {

		String OS = System.getProperty("os.name");
		FileReader inFile;
		String str = "";

		try {

			if (OS.startsWith("Windows")) { // Determines the file system to find the Crazy8s.txt file

				inFile = new FileReader("_txt\\Crazy8s.txt");
			}
			else {

				inFile = new FileReader("_txt/Crazy8s.txt");
			}

			// Creating a Scanner to read the FileReader

			Scanner input = new Scanner(inFile);

			while (input.hasNext()) { // Adds each line of the file to the ArrayList fileList

				str += input.nextLine() + "\n";
			}

			inFile.close();
		}
		catch (FileNotFoundException fnf) {

			return fnf.getMessage();
		}
		catch (IOException ioe) {

			return ioe.getMessage();
		}

		return str;
	}
}
