package edu.ggc.mdeiters.HomeWork1;

/**
 * Customer
 * @author Mike Deiters
 * @version 1.2
 * ITEC 2150 Spring 2015
 * Written: Jan 28, 2015
 * 
 * 
 * This will create instances of customers
 * 
 * Purpose is create a customer list
 *
 */

public class Customer {

	private String customerFirstName;
	private String customerLastName;
	private String customerName;
	private String phoneNumber;
	private Phone phoneName;
	private Plan planName;

    public Customer() {

	    this.customerFirstName = "";
	    this.customerLastName = "";
	    this.customerName = "";
	    this.phoneNumber = "";
	    this.phoneName = new Phone();
	    this.planName = new Plan();
    }

	/**
	 * Customer
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param plan
	 * This sets the customer data
	 */
	public Customer(String customerFirstName, String customerLastName, Phone phoneName, Plan planName) {

		// Sets the customer's first name

		this.customerFirstName = customerFirstName;

		// Sets the customer's last name

		this.customerLastName = customerLastName;

		// Sets the customer's phone name

		this.phoneName = phoneName;

		// Sets the customer's plan name

		this.planName = planName;

	}

	/**
	 * @return the customerFirstName
	 */
	public String getCustomerFirstName() {

		return customerFirstName;
	}

	/**
	 * @return the customerLastName
	 */
	public String getCustomerLastName() {

		return customerLastName;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {

		// Sets the customer's full name

		customerName = customerFirstName + " " + customerLastName;

		return customerName;
	}

	/**
	 * @param areaCode to generate the phoneNumber
	 */
	public void setPhoneNumber(int areaCode) {

		int numEnd = (int) ((Math.random() * 9000000) + 1000000);
		phoneNumber = "" + areaCode + numEnd;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {

		return phoneNumber;
	}

	/**
	 * @param phoneName the phoneName to set
	 */
	public void setPhoneName(Phone phoneName) {

		this.phoneName = phoneName;
	}

	/**
	 * @return the phoneName
	 */
	public String getPhoneName() {

		return phoneName.getPhoneName();
	}

	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(Plan planName) {

		this.planName = planName;
	}

	/**
	 * @return the planName
	 */
	public String getPlanName() {

		return planName.getPlanName();
	}

	/**
	 * @return the customer data to the main
	 */
	public String toString() {

		String result = customerName + "\n" + phoneNumber + "\n" + phoneName.getPhoneName() + "\n" + planName.getPlanName() + " Plan" + "\n";
		return result;
	}

}
