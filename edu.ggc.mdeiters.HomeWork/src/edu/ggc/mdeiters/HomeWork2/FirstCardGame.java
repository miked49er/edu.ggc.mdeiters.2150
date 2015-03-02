
package edu.ggc.mdeiters.HomeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Class: FirstCardGame
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 18, 2015
 * 
 * 
 * This will create a deck and print it to the console, shuffle the deck, and let the user select a card
 * 
 * Purpose is to create a card game
 * 
 */
public class FirstCardGame {

	/**
	 * Method: printDeckArray
	 * This will print the cards array to the console
	 * @param cards Array returned from the method printDeck from the CardDeck class
	 */
	public void printDeckArray(Card[] cards) {

		for (int i = 1; i <= cards.length; i++) {

			if (i % 13 == 0) { // Insert a line break every 13 cards
				
				System.out.print(cards[i - 1].toString() + ",\n");
			} else if (i == cards.length) { // No comma after the last card
				
				System.out.print(cards[i - 1].toString());
			} else { // Normal card then comma
				
				System.out.print(cards[i - 1].toString() + ", ");
			}
		}
	}

	public static void main(String[] args) {

		FirstCardGame fcg = new FirstCardGame();
		CardDeck deck = null;
		boolean notDone = false;
		Scanner input = new Scanner(System.in);
		int selectedCard = 0;

		try { // Try to create a new deck
			
			deck = new CardDeck();
		} catch (InvalidCardException ice) { // If InvalidCardException is thrown print the message of the exception
			
			System.out.println(ice.getMessage());
		}

		// Print the un-shuffled deck
		
		System.out.println("Here is the deck unshuffled\n-----------------------------------");
		fcg.printDeckArray(deck.printDeck());

		do {

			if (deck.shuffle()) { // If shuffle is successful then the notDone is false

				notDone = false;

			} else { // If shuffle is not successful then notDone is true and the process loops until shuffle is successful

				notDone = true;
			}
		} while (notDone);

		// Print the shuffled deck
		
		System.out.println("\n\n\nHere is the shuffled deck\n-----------------------------------");
		fcg.printDeckArray(deck.printDeck());

		try {
		
		// Deal and print the top card of the deck
		
		String foo = deck.deal().toString();
		System.out.println("\n\n\nThe top card on the deck is: " + foo);
		
		// Read input from the user to select a number between 1 and 52 to pick a card
		
		System.out.println("\n\nPlease select a number between 1 and 52");

		do {

			try { // Try to take in the input

				selectedCard = input.nextInt();

			} catch (InputMismatchException ime) { // If something other than an int is entered catch the InputMismatchException and loop to try again

				System.out.println(ime.getMessage() + "\nPlease select a number between 1 and 52");
			}
		} while (notDone);

		// Show the selected card
		
		System.out.println("\nThe selected card is the: " + deck.selectCard(selectedCard).toString());

		} catch (InvalidCardException ice) {
			
			System.out.println(ice.getMessage());
		}
	}
}
