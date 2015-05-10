
package edu.ggc.mdeiters.Final;

/** Class: Cat
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: May 7, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class Cat implements Pet {

	public Cat() {

	}

	/** Method: speak
	 * @return
	 * Method Description: TODO
	 */
	@Override
	public String speak() {

		return "meow";
	}

	/** Method: happy
	 * @return
	 * Method Description: TODO
	 */
	@Override
	public String happy() {

		return "purr";
	}

	/** Method: getPaws
	 * @return
	 * Method Description: TODO
	 */
	@Override
	public int getPaws() {

		return 4;
	}

	@Override
	public String toString() {

		return "I am a Cat. When I speak I say " + speak() + "\n" + "I " + happy() + " when I am happy and have " + getPaws() + " feet\n";
	}

}
