/**
 * Sale
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: January 28, 2015
 * 
 * 
 * This will create sale instances.
 * 
 * Purpose is to calculate the new sale
 *
 */

public class Sale {

	private boolean newCustomer;
	private double SALES_TAX;
	private static final double ACTIVATION_FEE = 25.00;
	private static final double UPGRADE_FEE = 25.00;
	private double saleTender;
	private Phone phonePrice;
	private Plan planPrice;

	/**
	 * Sale
	 * @param new
	 * @param tax
	 * @param phone
	 * @param plan
	 * This sets the values for the sale
	 */
	public Sale(boolean newCustomer, double SALES_TAX, Phone phonePrice, Plan planPrice) {

		// Determines if the customer is new

		this.newCustomer = newCustomer;

		// Sets the sales tax rate and the fees associated with the new sale

		this.SALES_TAX = SALES_TAX;

		// Sets the phone's price

		this.phonePrice = phonePrice;

		// Sets the plan's price

		this.planPrice = planPrice;

	}

	/**
	 * @return the newCustomer
	 */
	public boolean isNewCustomer() {

		return newCustomer;
	}
	
    /**
     * @param newCustomer the newCustomer to set
     */
    public void setNewCustomer(boolean newCustomer) {
    
    	this.newCustomer = newCustomer;
    }

	/**
	 * @return the SALES_TAX as a percentage
	 */
	public double getSALES_TAX() {

		return SALES_TAX * 100;
	}

	/**
	 * @return the phonePrice
	 */
	public double getPhonePrice() {

		return phonePrice.getPhonePrice();
	}
	
    /**
     * @param phonePrice the phonePrice to set
     */
    public void setPhonePrice(Phone phonePrice) {
    
    	this.phonePrice = phonePrice;
    }

	/**
	 * @return the planPrice
	 */
	public int getPlanPrice() {

		return planPrice.getPlanPrice();
	}
	
    /**
     * @param planPrice the planPrice to set
     */
    public void setPlanPrice(Plan planPrice) {
    
    	this.planPrice = planPrice;
    }

	/**
	 * tender
	 * @return the saleTender
	 * Calculates the final sale total
	 */
	public double tender() {

		if (newCustomer) { // If the customer is new they have an activation fee

			saleTender = ((ACTIVATION_FEE + phonePrice.getPhonePrice()) * SALES_TAX) + ACTIVATION_FEE + phonePrice.getPhonePrice() + planPrice.getPlanPrice();

		} else { // If the customer is not new then they have an upgrade fee

			saleTender = ((UPGRADE_FEE + phonePrice.getPhonePrice()) * SALES_TAX) + UPGRADE_FEE + phonePrice.getPhonePrice() + planPrice.getPlanPrice();
		}
		return saleTender;
	}

}
