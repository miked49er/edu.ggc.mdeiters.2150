
package edu.ggc.mdeiters.ExtraCredit1;

public interface FootballInterface {

	int getMaxScore();

	int getMinScore();

	double getAverage();

	int getCount();

	void enterScore(int homeScore, int visitorScore);

	String[] getGameScores();

}
