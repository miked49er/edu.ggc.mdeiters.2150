package edu.ggc.mdeiters.FinalProject;

import java.util.ArrayList;


/** Class: Hand
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 9, 2015
 * 
 * Class Description: The players hand
 * 
 * Purpose: To control the player's hand
 * 
 */
public class Hand {

	private ArrayList<Card> hand;
	private ArrayList<Card> playableCards;
	
	/**
	 * Constructor: Hand
	 *
	 */
	public Hand() {

		this.hand = new ArrayList<Card>();
		this.playableCards = new ArrayList<Card>();
	}
	
	/**
	 * Method: addHand 
	 * @param card
	 * Method Description: Adds a card to the player's hand
	 */
	public void addHand(Card card) {
		
	}
	
	/**
	 * Method: removeHand 
	 * @param card
	 * Method Description: Removes a card from the player's hand
	 */
	public void removeHand(Card card) {
		
	}
	
	/**
	 * Method: getHand 
	 * @return hand
	 * Method Description: Return an ArrayList of the player's hand
	 */
	public ArrayList<Card> getHand() {
		
		return this.hand;
	}
	
	/**
	 * Method: getPlayableCards 
	 * @return playableCards
	 * Method Description: Return an ArrayList of the player's playable cards
	 */
	public ArrayList<Card> getPlayableCards() {
		
		return this.playableCards;
	}
	
}
