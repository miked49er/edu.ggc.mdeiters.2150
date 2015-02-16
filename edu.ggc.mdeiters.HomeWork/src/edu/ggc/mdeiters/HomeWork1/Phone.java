package edu.ggc.mdeiters.HomeWork1;

/**
 * Phone
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: Jan 28, 2015
 * 
 * 
 * This will create phone instances
 * 
 * Purpose is to provide information about the phones
 *
 */
public class Phone {

	private String phoneName;
	private double phonePrice;
	private int phoneInventory = 0;

    public Phone() {

	    this.phoneName = "";
	    this.phonePrice = 0;
	    this.phoneInventory = 0;
    }

	/**
     * @param phoneName
     * @param phonePrice
     * @param phoneInventory
     */
    public Phone(String phoneName, double phonePrice, int phoneInventory) {

	    this.phoneName = phoneName;
	    this.phonePrice = phonePrice;
	    this.phoneInventory = phoneInventory;
    }

	/**
	 * @return the phoneInventory
	 */
	public int getPhoneInventory() {

		return phoneInventory;
	}

	/**
	 * @param phoneInventory the phoneInventory to set
	 */
	public void setPhoneInventory(int phoneInventory) {

		this.phoneInventory += phoneInventory;
	}

	/**
	 * @return the phonePrice
	 */
	public double getPhonePrice() {

		return phonePrice;
	}

	/**
	 * @param phonePrice the phonePrice to set
	 */
	public void setPhonePrice(double phonePrice) {

		this.phonePrice = phonePrice;
	}

	/**
	 * @return the phoneName
	 */
	public String getPhoneName() {

		return phoneName;
	}

	/**
	 * @param phoneName the phoneName to set
	 */
	public void setPhoneName(String phoneName) {

		this.phoneName = phoneName;
	}

	/**
	 * @return the phone with its price to the main
	 */
	public String phone() {

		String result;
		if (phoneName.length() >= 14) { // If phoneName is greater than or equal to 14 characters use 1 tab

			result = " " + phoneName + "\t" + "$" + phonePrice;

		} else { // Otherwise use 2 tabs

			result = " " + phoneName + "\t\t" + "$" + phonePrice;

		}
		return result;
	}

	/**
	 * @return the phone with its inventory to the main
	 */
	public String inventory() {

		String result;
		if (phoneName.length() >= 14) { // If phoneName is greater than or equal to 14 characters use 1 tab

			result = " " + phoneName + "\t" + phoneInventory;

		} else { // Otherwise use 2 tabs

			result = " " + phoneName + "\t\t" + phoneInventory;

		}
		return result;
	}

}
