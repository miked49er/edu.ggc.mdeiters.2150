
package edu.ggc.mdeiters.IC4;

/** Class: Manager
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 22, 2015
 * 
 * 
 * This will create the framework for a Manager
 * 
 * Purpose is to create a manager and calculate their salary
 * 
 */
public class Manager extends Employee {

	private String division;
	private double annualSalary;
	private double bonus;

	public Manager() {

		super();
		this.annualSalary = 0;
		this.bonus = 0;
	}

	/**
	 * Constructor Manager
	 * @param division
	 * @param annualSalary
	 * @param bonus
	 */
	public Manager(String name, String division, double annualSalary, double bonus) {

		super(name);
		this.division = division;
		this.annualSalary = annualSalary;
		this.bonus = bonus;
		calculateSalary();
	}

	/**
	 * @return the division
	 */
	public String getDivision() {

		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {

		this.division = division;
	}

	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {

		return annualSalary;
	}

	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(double annualSalary) {

		this.annualSalary = annualSalary;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {

		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {

		this.bonus = bonus;
	}

	/**
	 * Method: calculateSalary
	 * This will calculate the manager's salary as being their annualSalary + bonus
	 * @return the Manager's salary
	 */
	public double calculateSalary() {

		setSalary(annualSalary + bonus);
		return getSalary();
	}

	/**
	 * Method toString
	 * @return the Manager as a string
	 */
	public String toString() {

		return super.toString() + " is the " + getDivision() + " Manager with a Total Salary of $" + round(getSalary()) + "\nAnnual Salary: $"
		        + round(annualSalary) + "\nBonus: $" + round(bonus);
	}
}
