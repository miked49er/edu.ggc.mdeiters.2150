/**
 * Employee
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: Jan 28, 2015
 * 
 * 
 * This will create instances of employees
 * 
 * Purpose is to track employee sales
 *
 */
public class Employee {

	private String employeeName;
	private int numberOfSales = 0;

    public Employee() {

	    this.employeeName = "";
	    this.numberOfSales = 0;
    }

	/**
     * @param employeeName
     * @param numberOfSales
     */
    public Employee(String employeeName) {

	    super();
	    this.employeeName = employeeName;
	    this.numberOfSales = 0;
    }

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {

		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {

		this.employeeName = employeeName;
	}

	/**
	 * @return the numberOfSales
	 */
	public int getNumberOfSales() {

		return numberOfSales;
	}

	/**
	 * @param numberOfSales the numberOfSales to increment the employee's sales
	 */
	public void setNumberOfSales(int numberOfSales) {

		this.numberOfSales += numberOfSales;
	}

	/**
	 * @return the employeeName and the numberOfSales to the main
	 */
	public String toString() {

		String result;
		result = employeeName + " has sold " + numberOfSales + " phones.";
		return result;
	}

}
