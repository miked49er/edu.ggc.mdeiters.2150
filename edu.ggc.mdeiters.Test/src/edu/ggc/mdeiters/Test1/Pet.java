package edu.ggc.mdeiters.Test1;


/** Class: Pet
 *@ author ITEC 2150
 * version 1.0
 * Course: ITEC 2150 Spring 2015
 * Written: February 25, 2015
 *This class - This class super class of Dog, Cat, and Bird class.
 *Purpose:- The purpose of the class is create main properties of pets that uses subclass.
 */

public class Pet 
{
	protected String name;
	protected String breed;
	protected String color;
	protected int numOfLegs;
	protected int weight;

	/**
	 * Constructor with no arguments
	 * 
	 */
	public Pet()
	{
		this.name = "";
		this.breed = "mutt";
		this.color = "black";
		this.numOfLegs = 4;
		this.weight = 0;
	}

	/**
	 * Constructor with four arguments
	 * 
	 */
	public Pet(String name, String breed, String color, int weight)
	{
		this.name = name;
		this.breed = breed;
		this.color = color;			
		this.weight = weight;
		this.numOfLegs = 4;
	}

	/**
	 * Constructor with all fields	
	 */
	public Pet(String name, String breed, String color, int legs, int weight)
	{
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.numOfLegs = legs;
		this.weight = weight;
	}

	/**
	 * getter for name
	 * @return  the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name  the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return  the breed
	 */
	public String getBreed() 
	{
		return breed;
	}

	/**
	 * @param breed  the breed to set
	 */
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}

	/**
	 * @return  the color
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * @param color  the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * @return  the legs
	 */
	public int getLegs() 
	{
		return numOfLegs;
	}

	/**
	 * @param legs  the legs to set
	 */
	public void setLegs(int legs) 
	{
		this.numOfLegs = legs;
	}

	/**
	 * @return  the weight
	 */
	public int getWeight() 
	{
		return weight;
	}

	/**
	 * @param weight  the weight to set
	 */
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	/**
	 * What a pet eats
	 * @return returns, in a string, what the Pet eats
	 */
	public String eats()
	{
		return " eats pet food";
	}
	
	/* 
	 * formats the output of pet
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Pet [name = " + name + ", breed = " + breed + ", color = " + color
				+ ", number of legs = " + numOfLegs + ", weight = " + weight + "]";
	}
}
