package edu.ggc.mdeiters.Test1;


/** Class:Dog
 * @author ITEC 2150
 * version 1.0
 * Course: ITEC 2150 Spring 2015
 * Written: February 25, 2015
 *This class - This class subclass of Pet class and create the Dog method and constructor.
 *Purpose:- The purpose of the class is create the dog's method and constructor to call in PetTester class.
 */


public class Dog extends Pet
{
	private boolean trained;
	private String size; //large, medium, small

	/**
	 * Zero param constructor
	 */
	public Dog()
	{
		super();
		this.trained = true;
		this.size = "medium";
	}

	/**
	 * Constructor with all attributes
	 * @param name name of dog
	 * @param breed breed of dog
	 * @param coatColor coat color of dog
	 * @param trained whether the dog is trained or not
	 * @param size size of dog
	 * @param weight weight of dog
	 */
	public Dog (String name, String breed, String coatColor, boolean trained, String size, int weight)
	{
		super(name, breed, coatColor, weight);
		this.trained = trained;
		this.size = size;
	}

	/**
	 * Method: getTrained
	 * @param None
	 * @return is the dog trained?
	 */
	public boolean getTrained()
	{
		return trained;
	}

	/**
	 * Method: getSize
	 * @param None
	 * @return size of dog
	 */
	public String getSize()
	{
		return size;
	}

	/**
	 * Method: setTrained
	 * @param trained the trained to set
	 * @return None
	 */
	public void setTrained(boolean trained)
	{
		this.trained = trained;
	}

	/**
	 * Method: setSize
	 * @param size the size to set
	 * @return None
	 */
	public void setSize(String size)
	{
		this.size = size;
	}
	
	/** Method: eats
	 * Returns what the dog eats
	 * @param None
	 * @return String containing what the dog eats
	 */
	@Override
	public String eats()
	{
		return " eats dog food";
	}

	/** Method: toString
	 * return a String representation of the Cat
	 * @param None
	 * @return String for the Cat
	 */
	@Override
	public String toString() 
	{
		String dogString =super.toString();
		int first = dogString.indexOf(' ');
		String tempDog = dogString.substring(first, dogString.length() -1);
		return "Dog " + tempDog + " trained = " + trained + ", size = " + size + "]";
	}
}

