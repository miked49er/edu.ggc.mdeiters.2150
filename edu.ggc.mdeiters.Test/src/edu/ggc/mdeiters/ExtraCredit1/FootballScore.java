
package edu.ggc.mdeiters.ExtraCredit1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/** Class: FootballScore
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 2, 2015
 * 
 * 
 * This will track the football game results and report them back
 * 
 * Purpose is to track the results of football games
 * 
 */
public class FootballScore implements FootballInterface {

	private ArrayList<Integer[]> scores;

	/**
	 * Constructor: FootballScore
	 * @param null
	 */
	public FootballScore() {

		this.scores = new ArrayList<Integer[]>();
	}

	/**
	 * Constructor: FootballScore
	 * @param homeScore
	 * @param visitorScore
	 */
	public FootballScore(int homeScore, int visitorScore) {

		enterScore(homeScore, visitorScore);
	}

	/** Method: getMaxScore
	 * This will loop through the homeScore and visitorScore ArrayLists to find the maxScore
	 * @return the maxScore of all of the games
	 */
	@Override
	public int getMaxScore() {

		// Set the maxScore to be the first score in the ArrayList

		int maxScore = scores.get(0)[0];

		for (int i = 0; i < scores.size(); i++) {

			for (int j = 0; j < scores.get(i).length; j++) {

				if (maxScore < scores.get(i)[j]) { // Checks to see if the new score is larger than maxScore

					// Sets the new score to be maxScore since it was larger than maxScore

					maxScore = scores.get(i)[j];
				}
			}
		}

		return maxScore;

	}

	/** Method: getMinScore
	 * This will loop through the homeScore and visitorScore ArrayLists to find the minScore
	 * @return the minScore of all of the games
	 */
	@Override
	public int getMinScore() {

		// Sets minScore to the first score in the ArrayList

		int minScore = scores.get(0)[0];

		for (int i = 0; i < scores.size(); i++) {

			for (int j = 0; j < scores.get(i).length; j++) {

				if (minScore > scores.get(i)[j]) { // Checks to see if the new score is less than minScore

					// Sets the new score to be minScore since it was less than maxScore

					minScore = scores.get(i)[j];
				}
			}
		}

		return minScore;
	}

	/** Method: getAverage
	 * This will calculate the average of all of the scores
	 * @return the averaged score
	 */
	@Override
	public double getAverage() throws IllegalArgumentException {

		int sum = 0;
		double average;

		for (int i = 0; i < scores.size(); i++) {

			for (int j = 0; j < scores.get(i).length; j++) {

				// Adds all of the scores in the ArrayList to sum

				sum += scores.get(i)[j];
			}
		}

		// Divides sum by the size of scores multiplied by 2 since each element of scores is an Integer array that has 2 elements

		average = (double) (sum / (scores.size() * 2));

		return round(average, 2);
	}

	/**
	 * Method: round
	 * This will round the entered value to the specified number of places
	 * @param value double to be rounded
	 * @param places how many decimal point desired
	 * @return the rounded value
	 */
	public double round(double value, int places) throws IllegalArgumentException {

		if (places < 0) { // Test to make sure that places is larger than 0, because you can not round to a negative number of places

			throw new IllegalArgumentException("Can't round to a negative place");
		}

		// Creates a new BigDecimal with the passed in value

		BigDecimal bd = new BigDecimal(value);

		// Creates the scale that the BigDecimal will use to round with

		bd.setScale(places, RoundingMode.HALF_UP);

		return bd.doubleValue();
	}

	/** Method: getCount
	 * This will use the homeScore ArrayList size as the number of games entered
	 * @return how many games that have been entered
	 */
	@Override
	public int getCount() {

		return scores.size();
	}

	/** Method: enterScore
	 * This will take the input of the home team's score and visitor's score
	 * @param homeScore
	 * @param visitorScore
	 */
	@Override
	public void enterScore(int homeScore, int visitorScore) {

		// Creates a new Integer array with the homeScore and visitorScore

		Integer[] score = { homeScore, visitorScore };

		// Adds the Integer array to the scores ArrayList

		this.scores.add(score);
	}

	/** Method: getGameScores
	 * This will 
	 * @return
	 */
	@Override
	public String[] getGameScores() {

		// Creates a String array that is as big as the scores ArrayList

		String[] games = new String[scores.size()];

		for (int i = 0; i < scores.size(); i++) {

			if (scores.get(i)[0] > scores.get(i)[1]) { // Test to see if the home team won

				// Adds the home team won string the games Array

				games[i] = "The home team beat the visiting team " + scores.get(i)[0] + " to " + scores.get(i)[1];

			} else if (scores.get(i)[0] < scores.get(i)[1]) { // Test to see if the visitor team won

				// Adds the visitor team won string the games Array

				games[i] = "The visiting team beat the home team " + scores.get(i)[1] + " to " + scores.get(i)[0];

			} else { // Otherwise the game tied

				games[i] = "The game was a tie " + scores.get(i)[0] + " to " + scores.get(i)[1];
			}
		}

		return games;
	}

	/** Method: toString
	 * @return String
	 * Method Description: Outputs all of the games to a string
	 */
	@Override
	public String toString() {

		String gameList = "";

		// Enters the maxScore, minScore, and averageScore to gameList

		gameList += "The maximum score entered is: " + getMaxScore() + "\nThe minimum score entered is: " + getMinScore() + "\nThe average score is "
		        + getAverage();

		for (int i = 0; i < getGameScores().length; i++) {

			// Enters all of the games stored in the array that getGameScores() returns to gamesList

			gameList += "\n" + getGameScores()[i];
		}

		return gameList;
	}

}
