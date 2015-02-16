package edu.ggc.mdeiters.HomeWork1;

/**
 * PhoneSales
 * @author Mike Deiters
 * @version 1.2
 * ITEC 2150 Spring 2015
 * Written: January 28, 2015
 * 
 * 
 * This will create the phones, plans, employees, and new customers. Also it will conduct a new sale and keep track of employee's sales
 * 
 * Purpose is to create a phone sale environment
 *
 */

/*
1. What	is	an	algorithm?
 * a process or set of rules to be followed in calculations or other problem-solving operations, especially by a computer.
2. When	a Java program is compiled, what is the output? How	do you compile and execute a Java program from the command line?
 * Machine code
 * javac class.java
 * java <className>
3. What	is a class?
 * an extensible program-code-template for creating objects, providing initial values for state (member variables) and implementations of behavior 
 * (member functions, methods).
4. What	is encapsulation? Why is it used?
 * the packing of data and functions into a single component
 * A language mechanism for restricting access to some of the object's components
 * A language construct that facilitates the bundling of data with the methods (or other functions) operating on that data
5. What	is a constant? How is one created?. 
 * A variable that never changes
 * final variableType var = value;
6. What is a class method? How is one created?
 * A method that is invoked without reference to a particular object. Class methods affect the class as a whole, not a particular instance of the class
 * creating a setter method to receive the input to the variables, and a getter method to return the method
7. Name	two	decision constructs? Give an example of each.
 * if-else and switch
 * if(true){
 * do something;
 * }else{
 * do something else;
 * }
 * 
 * switch(expression){
 * case value:
 * statements;
 * break; optional
 * case vaule:
 * statements;
 * break; optional
 * default: optional
 * statements
 * }
 * 
8. What	are	three looping constructs? State whether	they are pre or post test constructs.
 * for pre
 * while pre
 * do while post
9. What	is an array?
 * a container object that holds a fixed number of values of a single type. The length of an array is established when the 
 * array is created. After creation, its length is fixed
10. What is an array list? What	are	the	advantages and disadvantages of using an array list?
 * Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, 
 * including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the 
 * array that is used internally to store the list.
 * 
 * Pros
 * the list is resizable
 * dont have to know how many element you will have in the array
 * dynamically managed
 * 
 * Cons
 * none
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PhoneSales {

	// Creating a String to collect user input errors

	private String error = "";
	
	// Receiving data values 
	
	private Data data = new Data();

	// Customer ArrayList to store new customers

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	/**
	 * printPhones
	 * @return String of the phones
	 * This will add all of the the phone names and prices from the phones array to a string to be printed
	 */
	private String printPhones() {

		String str = " Phone" + "\t\t" + "Price" + "\n" + "------------------------------------------------------\n";
		for (int i = 0; i < data.phones.length; i++) {
			str += i + 1 + "." + data.phones[i].phone() + "\n";
		}

		return str;

	}

	/**
	 * printPhoneInventory
	 * @return String of phones and their inventoryies
	 * This will add the phone names and inventories to a string to be printed
	 */
	private String printPhoneInventory() {

		String str = " Phone" + "\t\t" + "Inventory" + "\n" + "--------------------------------------------------------\n";
		for (int i = 0; i < data.phones.length; i++) {
			str += data.phones[i].inventory() + "\n";
		}

		return str;

	}

	/**
	 * selectPhone
	 * @return phone
	 * This will select the phone the customer wants
	 */
	private Phone selectPhone() {

		// New phone variable to select the phone the customer wants

		Phone phone = new Phone();

		do {
			errors();

			// String to input the phone the customer wants

			String phoneNum = jopInput(printPhones() + "\nPlease select a phone.");

			switch (phoneNum) {
				case "1":
					phone = data.gs5;
					break;
				case "2":
					phone = data.gs4;
					break;
				case "3":
					phone = data.iPhone6;
					break;
				case "4":
					phone = data.iPhone5s;
					break;
				case "5":
					phone = data.motoG;
					break;
				case "6":
					phone = data.htc510;
					break;
				case "7":
					phone = data.nokia635;
					break;
				case "8":
					phone = data.nokia1320;
					break;
				default: // Otherwise returns an error
					error = "Invalid Selection";
					break;
			}
			if (phone.getPhoneInventory() <= 0) {
				error = "I'm sorry we are out of stock of the " + phone.getPhoneName();
			}
		} while (!error.isEmpty());

		return phone;
	}

	/**
	 * printPlans
	 * @return String of plans
	 * This will add the plans to a string to be printed
	 */
	private String printPlans() {

		// String to hold the phones and their inventories

		String str = "";

		for (int i = 0; i < data.plans.length; i++) {
			str += data.plans[i].toString(i);
		}

		return str;

	}

	/**
	 * selectPlan
	 * @return plan
	 * This will select the plan the customer wants
	 */
	private Plan selectPlan() {

		// New plan variable to select the plan the customer wants

		Plan plan = new Plan();

		do {
			errors();

			// String to input the plan the customer wants

			String planNum = jopInput(printPlans() + "\nPlease select a plan.");

			switch (planNum) {
				case "1":
					plan = data.basic;
					break;
				case "2":
					plan = data.smart;
					break;
				case "3":
					plan = data.pro;
					break;
				default: // Otherwise returns an error
					error = "Invalid Selection";
					break;
			}
		} while (!error.isEmpty());

		return plan;

	}

	/**
	 * printEmployees
	 * @return string of employees
	 * This will add the employees to a string to be printed
	 */
	private String printEmployees() {

		// String to hold the employees

		String str = "";

		for (int i = 0; i < data.employees.length; i++) {
			str += (i + 1) + ". " + data.employees[i].getEmployeeName() + "\n";
		}

		return str;

	}

	/**
	 * printEmployeeSales
	 * @return String of employee sales
	 * This will add the employee's number of sales to a string to be printed
	 */
	private String printEmployeeSales() {

		// String to hold the employee sales

		String str = "";

		for (int i = 0; i < data.employees.length; i++) {
			str += data.employees[i].getEmployeeName() + "\n" + "Number of Sales: " + data.employees[i].getNumberOfSales() + "\n\n";
		}

		return str;

	}

	/**
	 * printCustomers
	 * @return string of customers
	 * This will add all of the customers in the customers ArrayList to a string to be printed
	 */
	private String printCustomers() {

		// String to hold the customers

		String str = "";

		for (int i = 0; i < customers.size(); i++) {
			str += customers.get(i).toString() + "\n";
		}

		return str;
	}

	/**
	 * round
	 * @param a double
	 * @return String
	 * This will round a double to two decimal places
	 */
	private String round(double num) {

		// Creates a pattern for the DecimalFormat

		String pattern = "###0.00";

		// Creates a DecimalFormat to round the currency values with

		DecimalFormat df = new DecimalFormat(pattern);

		return df.format(num);
	}

	/**
	 * errors
	 * @return void
	 * This will print out any errors
	 */
	private void errors() {

		if (!error.isEmpty()) {
			jopDialog(error);
		}

		// Resets the error variable

		error = "";
	}

	/**
	 * Method: jopInput
	 * This will create an input dialog
	 * @param prompt
	 * @return the input
	 */
	public String jopInput(String prompt) {

		String input = JOptionPane.showInputDialog(new JTextArea(prompt));
		return input;
	}

	/**
	 * Method: jopDialog
	 * This will create a message dialog 
	 * @param dialog
	 * @return void
	 */
	public void jopDialog(String dialog) {

		JOptionPane.showMessageDialog(null, new JTextArea(dialog));
	}

	/**
	 * menu
	 * @return void
	 * This will create the menu
	 */
	private void menu() {

		do {
			errors();

			// Takes in an string input to choose what the user wants to do

			String menu = jopInput("1. New Sale" + "\n" + "2. Phone List" + "\n" + "3. Plan List" + "\n" + "4. Employee List" + "\n" + "5. Phone Inventory"
			        + "\n" + "6. Employee Sales" + "\n" + "7. Customer List" + "\n" + "8. End");

			switch (menu.substring(0, 1)) {
				case "1":
					newSale();
					menu();
					break;
				case "2":
					jopDialog(printPhones());
					menu();
					break;
				case "3":
					jopDialog(printPlans());
					menu();
					break;
				case "4":
					jopDialog(printEmployees());
					menu();
					break;
				case "5":
					jopDialog(printPhoneInventory());
					menu();
					break;
				case "6":
					jopDialog(printEmployeeSales());
					menu();
					break;
				case "7":
					jopDialog(printCustomers());
					menu();
					break;
				case "8":
					jopDialog("Thank you for choosing Mike Wireless. Have an amazing day.");
					System.exit(0);
					break;
				default: // Otherwise returns an error
					error = "Invalid Selection";
					break;
			}
		} while (!error.isEmpty());

	}

	/**
	 * newSale
	 * @return void
	 * This will calculate the new sale
	 */
	private void newSale() {

		// Sets the SALES_TAX variable

		final double SALES_TAX = .06;
		int newCust;
		boolean newCustomer = true;
		String firstName;
		String lastName;
		int areaCode;
		int customerIndex = 0;
		Phone newPhone = new Phone();
		Plan newPlan = new Plan();

		do {
			errors();

			// Selects the employee that the new sale belongs to

			String employeeSale = jopInput(printEmployees() + "\nWhom does this sale belong to?");

			switch (employeeSale.substring(0, 1)) {
				case "1":
					data.joe.setNumberOfSales(1);
					break;
				case "2":
					data.steve.setNumberOfSales(1);
					break;
				case "3":
					data.mike.setNumberOfSales(1);
					break;
				default: // Otherwise returns an error
					error = "Invalid entry";
					break;
			}
		} while (!error.isEmpty());

		do {
			errors();

			// Int variable to select if the customer is new or not
			
			newCust = JOptionPane.showConfirmDialog(null, "Is this a new customer", "New Customer", JOptionPane.YES_NO_OPTION);

			if (newCust == JOptionPane.YES_OPTION) {

				// Boolean telling the sale class the that the customer is new 

				newCustomer = true;

				// String for the customer's first name

				firstName = jopInput("Please enter the customer's FIRST name. (No spaces please)");

				// String for the custoemr's last name

				lastName = jopInput("Please enter the customer's LAST name. (No spaces please)");

				// New instance variable of Phone to read inputs to the customer data

				newPhone = selectPhone();

				// New instance variable of Plan to read input to the customer data

				newPlan = selectPlan();

				do {
					errors();

					// Int input for the customer to choose his/her area code

					areaCode = Integer.parseInt(jopInput("Please enter a 3 digit area code."));

					// Checks to make sure the area code entered is only 3 digits long

					if (areaCode >= 1000) {
						error = "Area Code is too long.";
					} else if (areaCode < 100) {
						error = "Area Code is too short.";
					}
				} while (!error.isEmpty());

				// Creates a new customer and adds the new customer data to the customers ArrayList

				customers.add(new Customer(firstName, lastName, newPhone, newPlan));

				// Int to index the customer in the customer ArrayList customers

				customerIndex = customers.size() - 1;

				customers.get(customerIndex).setPhoneNumber(areaCode);

			} else if (newCust == JOptionPane.NO_OPTION) {

				// Boolean telling the sale class the that the customer is not new

				newCustomer = false;

				// Testing to see if the customers ArrayList is empty or not

				if (customers.size() <= 0) {
					error = "We don't have any existing customers. Therefore you must be new.";
					errors();
					newSale();
				}

				do {
					errors();

					// String for the customer's first name

					firstName = jopInput("I am terribly sorry but what is your first name again?");

					// String for the custoemr's last name

					lastName = jopInput("And what was your last name?");

					// Int to index the customer in the customer ArrayList customers

					customerIndex = 0;

					// Searches customers for the lastName entered then the firstName

					for (int i = 0; i < customers.size(); i++) {

						if ((customers.get(i).getCustomerLastName()).equalsIgnoreCase(lastName)) {

							if ((customers.get(i).getCustomerFirstName()).equalsIgnoreCase(firstName)) {
								customerIndex = i;
							}
						} else { // Otherwise returns an error

							error = "No customer with the name " + firstName + " " + lastName;
						}
					}

				} while (!error.isEmpty());

				// New instance variable of Phone to read inputs to the customer data

				newPhone = selectPhone();

				// New instance variable of Plan to read input to the customer data

				newPlan = selectPlan();

				// Adds the new phone and plan information the the customer in customers
				customers.get(customerIndex).setPhoneName(newPhone);
				customers.get(customerIndex).setPlanName(newPlan);

			} else { // Otherwise returns an error

				error = "Invalid entry.";
			}

		} while (!error.isEmpty());

		// Creates a new sale

		Sale newSale = new Sale(newCustomer, SALES_TAX, newPhone, newPlan);

		// Removes 1 from the inventory of the selected phone

		newPhone.setPhoneInventory(-1);

		jopDialog("\n" + customers.get(customerIndex).getCustomerName() + "\t" + customers.get(customerIndex).getPhoneNumber() + "\n" + "Phone: \t$"
		        + newSale.getPhonePrice() + "\t" + customers.get(customerIndex).getPhoneName() + "\n" + "Plan: \t$" + newSale.getPlanPrice() + "\t"
		        + customers.get(customerIndex).getPlanName() + "\n" + "Fees: \t$25" + "\n" + "Tax: \t" + round(newSale.getSALES_TAX()) + "%" + "\n"
		        + "Total: \t$" + round(newSale.tender()));

		menu();

	}

	public static void main(String[] args) {

		// Creating an instance in of PhoneSales

		PhoneSales phoneSale = new PhoneSales();

		phoneSale.menu();
	}

}
