
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
 * This will 
 * 
 * Purpose is 
 * 
 */
public class FirstCardGame {

	/**
	 * Method: printDeckArray
	 * This will print the cards array to the console
	 * @param cards Array returned from the method printDeck from the CardDeck class
	 */
	public void printDeckArray(Card[] cards) {

		for (int i = 0; i < cards.length; i++) {

			if (i == 12 || i == 25 || i == 38) {
				System.out.print(cards[i].toString() + ",\n");
			} else if (i == cards.length - 1) {
				System.out.print(cards[i].toString());
			} else {
				System.out.print(cards[i].toString() + ", ");
			}
		}
	}

	public static void main(String[] args) {

		FirstCardGame fcg = new FirstCardGame();
		CardDeck deck = null;
		boolean notDone = false;
		Scanner input = new Scanner(System.in);
		int selectedCard = 0;

		try {
			deck = new CardDeck();
		} catch (InvalidCardException ice) {
			System.out.println(ice.getMessage());
		}

		System.out.println("Here is the deck unshuffled\n-----------------------------------");
		fcg.printDeckArray(deck.printDeck());

		do {

			if (deck.shuffle()) {

				notDone = false;

			} else {

				notDone = true;
			}
		} while (notDone);

		System.out.println("\n\n\nHere is the shuffled deck\n-----------------------------------");
		fcg.printDeckArray(deck.printDeck());

		System.out.println("\n\n\nPlease select a number between 1 and 52");

		do {

			try {

				selectedCard = input.nextInt();

			} catch (InputMismatchException ime) {

				System.out.println(ime.getMessage() + "\nPlease select a number between 1 and 52");
			}
		} while (notDone);

		System.out.println("\nThe selected card is the: " + deck.selectCard(selectedCard).toString());
	}
}
