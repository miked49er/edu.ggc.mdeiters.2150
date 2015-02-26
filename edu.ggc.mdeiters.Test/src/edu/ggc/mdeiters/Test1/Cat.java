package edu.ggc.mdeiters.Test1;


/** Class:Cat
 * @author ITEC 2150
 * version 1.0
 * Course: ITEC 2150 Spring 2015
 * Written: February 25, 2015
 * This class - This class subclass of Pet class and create the Cat method and constructor.
 * Purpose:- The purpose of the class is create the cat's method and constructor to call in PetTester class.
 */

public class Cat extends Pet
{
	private boolean likesMice;

	/** Cat
	 * No argument constructor
	 */
	public Cat()
	{
		super();
		likesMice = true;
	}
	
	/**
	 * Cat
	 * 5 argument constructor
	 * Set number of legs to default to 4
	 * @param name name of cat
	 * @param breed breed of cat
	 * @param coatColor color of cat's coat
	 * @param likesMice Whether the cat likes mice or not
	 * @param weight weight of cat
	 */
	public Cat (String name, String breed, String coatColor, boolean likesMice, int weight)
	{
		super(name, breed, coatColor, weight); 
		this.numOfLegs = 4; 
		this.likesMice = likesMice;
	}

	/**
	 * Cat
	 * Constructor with all attributes
	 * @param name name of cat
	 * @param breed breed of cat
	 * @param coatColor color of cat's coat
	 * @param weight cat's weight
	 * @param legs num of legs cat's has
	 */
	public Cat (String name, String breed, String coatColor, int weight, int legs)
	{
		super(name, breed, coatColor, legs, weight);
	}

	/** Method: isLikesMice
	 * getter for likesMice variable
	 * @param None
	 * @return boolean likesMice
	 */
	public boolean isLikesMice()
	{
		return likesMice;
	}

	/** Method: setLikesMice
	 * setter for likesMice variable
	 * @param boolean likesMice
	 * @return void
	 */
	public void setLikesMice(boolean likesMice)
	{
		this.likesMice = likesMice;
	}

	/** Method: eats
	 * returns what the Cat eats
	 * @param None
	 * @return String containing what the cat eats
	 */
	@Override
	public String eats()
	{
		return " eats cat food";
	}

	/** Method: toString
	 * return a String representation of the Cat
	 * @param None
	 * @return String for the Cat
	 */
	@Override
	public String toString() 
	{
		String catString = super.toString();
		int first = catString.indexOf(' ' );
		String tempCat = catString.substring(first, catString.length() -1);
		String tempLikes ="";
		if (likesMice)
		{
			tempLikes = " likes mice. ";
		}
		else
		{
			tempLikes = " hates mice.";
		}
		return "Cat " + tempCat + ".  " + getName() + tempLikes + "]";
	}
}
