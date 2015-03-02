package edu.ggc.mdeiters.HomeWork2;


/** Class: InvalidCardException
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 17, 2015
 * 
 * 
 * This will create a new exception for invalid card values or suits
 * 
 * Purpose is create a new exception
 * 
 */
public class InvalidCardException extends Exception {

	public InvalidCardException() {
		
	}
	
	/**
	 * @param message
	 */
	public InvalidCardException(String message) {

		super(message);
	}

}
