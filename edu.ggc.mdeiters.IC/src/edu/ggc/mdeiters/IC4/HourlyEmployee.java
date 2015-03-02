
package edu.ggc.mdeiters.IC4;

/** Class: HourlyEmployee
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 22, 2015
 * 
 * 
 * This will create a framework for hourly employees
 * 
 * Purpose is create a hourly employee and calculate their salary
 * 
 */
public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private double numHours;

	public HourlyEmployee() {

		super();
		this.hourlyRate = 0;
		this.numHours = 0;
	}

	/**
	 * Constructor HourlyEmployee
	 * @param name
	 * @param hourlyRate
	 * @param numHours
	 */
	public HourlyEmployee(String name, double hourlyRate, double numHours) {

		super(name);
		this.hourlyRate = hourlyRate;
		this.numHours = numHours;
		calculateSalary();
	}

	/**
	 * Method: calculateSalary
	 * This will calculate the HourlyEmployee's weekly salary as hourlyRate * numHours
	 * @return the HourlyEmployee's salary
	 */
	public double calculateSalary() {

		setSalary(hourlyRate * numHours);
		return getSalary();
	}

	/**
	 * Method toString
	 * @return the HourlyEmployee as a string
	 */
	public String toString() {

		return super.toString() + " is an Hourly Employee with a Weekly Salary of $" + round(getSalary()) + "\nWorks " + numHours + " for $"
		        + round(hourlyRate) + "/hr";
	}

}
