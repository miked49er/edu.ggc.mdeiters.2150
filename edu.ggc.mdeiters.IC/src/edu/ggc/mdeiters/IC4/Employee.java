package edu.ggc.mdeiters.IC4;


/** Class: Employee
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 20, 2015
 * 
 * 
 * This will create the base for any employee
 * 
 * Purpose is to create a employee with an abstract method calculateSalary
 * 
 */
public abstract class Employee implements Comparable<Double> {
	
	private String name;
	private double salary;
	
	public Employee() {

	    this.name = "";
    }

	public Employee(String name) {

	    this.name = name;
    }

	
    /**
     * @return the name
     */
    public String getName() {
    
    	return name;
    }

	
    /**
     * @param name the name to set
     */
    public void setName(String name) {
    
    	this.name = name;
    }

	
    /**
     * @return the salary
     */
    public double getSalary() {
    
    	return salary;
    }

	
    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
    
    	this.salary = salary;
    }
	
    /**
     * Method: calculateSalary
     * This will create an abstract method that must be implemented in each class extending from Employee
     * @return double The employee's salary
     */
    public abstract double calculateSalary();
    
    /**
     * Method: compareTo
     * This will compare the employee's salary to another employee's salary
     * @param salaryCompareTo
     * @return an int for the difference between the two salaries
     */
    public int compareTo(Employee salaryCompareTo) {
    	
    	return (int)(salary - salaryCompareTo.getSalary());
    	
    }
    
    /**
     * Method toString
     * @return the employee as a string
     */
    public String toString() {
    	
    	return "The employee's name: " + name + "\nSalary: " + salary;
    }
	
}
