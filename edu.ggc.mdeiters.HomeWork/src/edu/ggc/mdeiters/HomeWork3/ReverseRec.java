
package edu.ggc.mdeiters.HomeWork3;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/** Class: ReverseRec
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 31, 2015
 * 
 * Class Description: Reversing strings
 * 
 * Purpose: use recursion to reverse strings
 * 
 */
public class ReverseRec {

	private String orig;
	private String wordEnds;
	private String revEnds;
	private ArrayList<String> revList;
	private ArrayList<String> revWordList;

	/**
	 * Constructor: ReverseRec
	 * 
	 */
	public ReverseRec() {

		this.orig = "";
		this.wordEnds = "";
		this.revEnds = "";
		this.revList = new ArrayList<String>();
		this.revWordList = new ArrayList<String>();

	}

	/**
	 * Method: reverseString 
	 * @param str String to be reversed
	 * @return void
	 * Method Description: Called method to control calling other methods to reverse the String
	 */
	public void reverseString(String str) {

		// Assigns str to orig

		this.orig = str;
		buildList(str);
		pullStrings(this.revList);

		// Assigns the return of lastChar to wordEnds

		this.wordEnds = lastChar(this.revWordList, 0);

		// Assigns the return of reverseWord to revEnds

		this.revEnds = reverseWords(this.wordEnds);

	}

	/**
	 * Method: buildList 
	 * @param str String to be reversed
	 * @return String
	 * Method Description: Recursively reverse str and add to revList
	 */
	private String buildList(String str) {

		// Assigns the first word of the string to orig

		String orig = str.substring(str.lastIndexOf(" ") + 1);

		// Adds orig to revList

		this.revList.add(orig);

		if (str.length() - orig.length() - 1 < 0) { // If str - orig -1 is less than 0 then return str

			return str;
		}
		else { // Otherwise call the method again

			buildList(str.substring(0, str.length() - orig.length() - 1));
		}

		return orig;
	}

	/**
	 * Method: pullStrings 
	 * @param list ArrayList of Strings
	 * @return rev String
	 * Method Description: Recursively pulls strings from the list, passes them to the reverseWords method, and adds the return of reverseWord to revWordList
	 */
	private String pullStrings(ArrayList<String> list) {

		String rev = "";
		if (list.isEmpty()) { // Returns an empty string if list is empty

			return "";
		}
		if (!list.isEmpty()) { // If list is not empty the assign the first element to rev and remove the element from list

			rev = list.get(0);
			list.remove(0);
		}

		// Adds the return of reverseWords method to revWordList

		this.revWordList.add(reverseWords(rev));
		pullStrings(list);
		return rev;
	}

	/**
	 * Method: reverseWords 
	 * @param str String to be reversed
	 * @return rev a reversed string
	 * Method Description: Recursively reverses the string
	 */
	private String reverseWords(String str) {

		if (str.length() - 1 == 0) { // If the string is a single char then return the char

			return str;
		}

		// Assigns the recursively return of reverseWords to rev

		String rev = reverseWords(str.substring(1)) + str.substring(0, 1);

		return rev;
	}

	/**
	 * Method: lastChar 
	 * @param str ArrayList of Strings
	 * @param index int of the location to be in str
	 * @return String of the last char in each element of str
	 * Method Description: Recursively finds the last char in each element of str to return
	 */
	private String lastChar(ArrayList<String> str, int index) {

		String rev = "";

		if (str.size() <= index) { // If str is smaller than index return an empty string

			return "";
		}
		else { // Otherwise assign the last char of str to rev

			rev += str.get(index).substring(str.get(index).length() - 1);
		}

		if (str.size() > index) { // If str is larger than index then call lastChar again

			rev += lastChar(str, index + 1);
		}
		return rev;
	}

	@Override
	/**
	 * Method: toString
	 * @return String
	 * Method Description: Output the original string along with the reversed, last chars, and the reverse of the last chars
	 */
	public String toString() {

		String str = "";

		// The output of orig
		
		str += this.orig + "\n";

		for (int i = 0; i < revWordList.size(); i++) { // Loop through to output all of revWordList as a String

			if (i == revWordList.size() - 1) { // If the last element of revWordList then add a new line char to the string
				
				str += revWordList.get(i) + "\n";
			}
			else { // Otherwise just output the element
				
				str += revWordList.get(i) + " ";
			}
		}

		// Output revWordList as a list
		
		str += revWordList + "\n";

		// Output wordEnds
		
		str += this.wordEnds + "\n";
		
		// Output revEnds
		
		str += this.revEnds;

		return str;
	}
}
