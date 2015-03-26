
package edu.ggc.mdeiters.IC7;

/** Class: BinaryConverter
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 24, 2015
 * 
 * Class Description: Convert an int to binary
 * 
 * Purpose: Use recursion to convert an int to binary
 * 
 */
public class BinaryConverter {

	private boolean negative;

	/**
	 * Method: binary 
	 * @param num Int to be converted to binary
	 * @return str String of the binary number
	 * Method Description: Checks for a negative number and handles calling binaryConvert, validate, and twosCompliment
	 */
	public String binary(int num) {

		// Validates that the number is positive for binaryConvert

		String str = binaryConvert(validate(num));

		if (negative) { // If the number was found to be negative in the validate method

			return formatter(twosCompliment(str));
		}

		return formatter(str);
	}

	/**
	 * Method: validate 
	 * @param num Int being converted to binary
	 * @return num positive Int
	 * Method Description: Test to see if the num is negative
	 */
	private int validate(int num) {

		if (num < 0) { // If num is negative

			// Sets negative to true to be handled later

			negative = true;

			// Returns a positive num

			return -num;
		}

		return num;
	}

	/**
	 * Method: formatter 
	 * @param str String of a binary number to format in 4 bit sections
	 * @return temp String of the formated binary
	 * Method Description: Makes the binary number into an 8 bit form and adds a space every 4 bits
	 */
	public String formatter(String str) {

		// Sets missing to be the modulus 8 of str.length()

		int missing = str.length() % 8;

		if (missing != 0) { // Test to see if missing is not 0

			// Assigns str to temp

			String temp = str;

			// Clears str to add 0's to the beginning of str

			str = "";

			for (int i = 0; i < (8 - missing); i++) {

				// Adds the difference between 8 and missing number of "0"  to str

				str += "0";
			}

			// Adds temp to the end of str

			str += temp;
		}

		// Clears temp for reuse

		String temp = "";

		for (int i = 1; i <= str.length(); i++) {

			// Add the char at (i-1)

			temp += str.charAt(i - 1);

			if (i == str.length()) { // Prevents adding a space at the end of the string

			}
			else if (i % 4 == 0) { // Adds a space every 4 bits

				temp += " ";
			}
		}

		return temp;

	}

	/**
	 * Method: binaryConvert
	 * @param num Int to convert to binary
	 * @return str String of the binary
	 * Method Description: Convert num to binary
	 */
	private String binaryConvert(int num) {

		if (num == 0) { // Return a "0" if num is 0

			return "0";
		}
		else if (num == 1) { // Return a "1" if the num is 1

			return "1";
		}

		// Assign the recursion return of binaryConvert to str

		String str = binaryConvert(num / 2);

		// Adds modulus 2 of num to str
		str += (num % 2);

		return str;

	}

	/**
	 * Method: twosCompliment 
	 * @param str String of the binary number
	 * @return comp String of the negative binary number
	 * Method Description: Uses the 2's complement to convert the binary number to a negative binary number
	 */
	private String twosCompliment(String str) {

		// Sets missing to be the modulus 8 of str.length()

		int missing = str.length() % 8;

		if (missing != 0) { // Test to see if missing is not 0

			// Assigns str to temp

			String temp = str;

			// Clears str to add 0's to the beginning of str

			str = "";

			for (int i = 0; i < (8 - missing); i++) {

				// Adds the difference between 8 and missing number of "0"  to str

				str += "0";
			}

			// Adds temp to the end of str

			str += temp;
		}

		String comp = "";

		for (int i = 0; i < str.length(); i++) { // Changes '1' to '0' and '0' to '1'

			if (str.charAt(i) == '0') { // If '0' add "1" to comp

				comp += "1";
			}
			else if (str.charAt(i) == '1') { // If '1' add "0" to comp

				comp += "0";
			}
		}

		// Assigns the length -1 of comp to index

		int index = comp.length() - 1;

		// Assigns 1 to tempComp

		String tempComp = "1";

		for (int i = comp.length() - 1; i >= index; i--) {

			if (comp.charAt(i) == '0') { // If '0' assign i to index

				index = i;
			}
			else if (comp.charAt(i) == '1') { // If '1' add "0" to tempComp

				tempComp += "0";

				// Decrement index
				index--;
			}

		}

		// Changes the end of comp to be tempComp
		comp = comp.substring(0, index) + tempComp;

		// Resets negative

		negative = false;

		return comp;
	}
}
