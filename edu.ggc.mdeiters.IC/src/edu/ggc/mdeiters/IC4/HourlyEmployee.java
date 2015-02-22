package edu.ggc.mdeiters.IC4;


/** Class: HourlyEmployee
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 22, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private double numHours;
	
	public HourlyEmployee() {

		super();
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
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Double o) {

		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ggc.mdeiters.IC4.Employee#calculateSalary()
	 */
	@Override
	public double calculateSalary() {

		setSalary(hourlyRate * numHours); 
		return getSalary();
	}
	
	public String toString() {
		return toString() + "\nHourly Rate: " + hourlyRate + "\nNumber of hours worked: " + numHours;
	}

}
