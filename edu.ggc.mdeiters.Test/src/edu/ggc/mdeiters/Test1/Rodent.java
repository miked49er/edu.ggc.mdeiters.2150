
package edu.ggc.mdeiters.Test1;

/** Class: Rodent
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 26, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class Rodent extends Pet {

	private boolean hasWheel;

	public Rodent() {

		super();
	}

	/**
	 * @param name
	 * @param breed
	 * @param color
	 * @param weight
	 */
	public Rodent(String name, String breed, String color, int weight, boolean hasWheel) {

		super(name, breed, color, weight);
		this.hasWheel = hasWheel;
	}

	/**
	 * @param name
	 * @param breed
	 * @param color
	 * @param legs
	 * @param weight
	 */
	public Rodent(String name, String breed, String color, int legs, int weight, boolean hasWheel) {

		super(name, breed, color, legs, weight);
		this.hasWheel = hasWheel;
	}

	/**
	 * Method: isHasWheel
	 * This will 
	 * @return
	 */
	public boolean isHasWheel() {

		return hasWheel;
	}

	/**
	 * Method: setHasWheel
	 * This will 
	 * @param hasWheel
	 */
	public void setHasWheel(boolean hasWheel) {

		this.hasWheel = hasWheel;
	}

	@Override
	public String eats() {

		return " eats rodent food";
	}

	@Override
	public String toString() {

		return "Rodent [hasWheel=" + hasWheel + ", toString()=" + super.toString() + "]";
	}

}
