
package edu.ggc.mdeiters.FinalProject;

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

	private boolean canPlay;
	private boolean isValid;
	private int startingHand;
	private boolean hasWon;

	/**
	 * Constructor: GameRules
	 *
	 */
	public GameRules() {

		this.canPlay = false;
		this.isValid = false;
		this.startingHand = 8;
		this.hasWon = false;
	}

	/**
	 * Method: canPlay 
	 * @return canPlay boolean
	 * Method Description: checks to see if the player can play from their hand
	 */
	public boolean canPlay() {

		return canPlay;
	}

	/**
	 * Method: isValid 
	 * @return isValid boolean
	 * Method Description: Verifies to ensure that the player is making a legal play
	 */
	public boolean isValid() {

		return isValid;
	}

	/**
	 * Method: getStartingHand 
	 * @return startingHand int
	 * Method Description: Returns the starting size of the player's hands
	 */
	public int getStartingHand() {

		return startingHand;
	}

	/**
	 * Method: isHasWon 
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
