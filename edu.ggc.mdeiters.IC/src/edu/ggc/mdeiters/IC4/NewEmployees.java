
package edu.ggc.mdeiters.IC4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

/** Class: NewEmployees
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 22, 2015
 * 
 * 
 * This will randomly generate 10 employees, print, sort, and reprint the employees
 * 
 * Purpose is use abstract methods, inheritance, and comparable to create and sort employees
 * 
 */
public class NewEmployees {

	/**
	 * Method: createEmployees
	 * This will create 10 random employees
	 * @param employees ArrayList of Employees
	 * @return the Employee ArrayList
	 */
	private ArrayList<Employee> createEmployees(ArrayList<Employee> employees) {

		// Array of employee names

		String[] names = { "Garrison", "Cassie", "Tim", "Tammy", "Sam", "Kim", "Hannah", "Kevin", "Young", "Tommy" };

		// Array of Manager divisions

		String[] div = { "Floor", "Store", "Bakery", "Deli", "Assistant Floor", "Fuel", "Customer Service", "Grocery", "Dairy", "Assistant Store" };

		// Loops 10 times to randomly create 10 employees

		for (int i = 0; i < 10; i++) {

			// Randomly generated int to determine if this employee is a manager or hourly employee

			int num = (int) (Math.random() * 10);

			if (num % 2 == 0) { // if num is even then the employee will be a manager

				employees.add(new Manager(names[i], div[i], (Math.random() * 10000) + 10000, Math.random() * 100));

			} else { // Otherwise the employee is hourly

				employees.add(new HourlyEmployee(names[i], (Math.random() * 10) + 7.25, (int) ((Math.random() * 28) + 12)));
			}
		}
		return employees;
	}

	/**
	 * Method: printEmployees
	 * This will print the Employee ArrayList
	 * @param employees ArrayList of Employee
	 */
	private void printEmployees(ArrayList<Employee> employees) {

		String output = "";

		for (int i = 0; i < employees.size(); i++) {

			// Loops through the Employee ArrayList adding the toString of the Employee to output

			output += employees.get(i).toString() + "\n\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}

	/**
	 * Method: sortEmployees
	 * This will sort the Employee ArrayList from greatest salary to the least
	 * @param employees ArrayList of Employee
	 * @return the Employee ArrayList
	 */
	private ArrayList<Employee> sortEmployees(ArrayList<Employee> employees) {

		Collections.sort(employees);

		return employees;
	}

	public static void main(String[] args) {

		// Instance of NewEmployees to call non-static methods

		NewEmployees ne = new NewEmployees();

		// ArrayList to hold the 10 Employees this class will create

		ArrayList<Employee> employees = new ArrayList<Employee>();

		ne.createEmployees(employees);
		ne.printEmployees(employees);

		ne.sortEmployees(employees);
		ne.printEmployees(employees);
		
		System.exit(0);
	}

}
