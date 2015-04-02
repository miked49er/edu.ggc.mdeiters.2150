
package edu.ggc.mdeiters.HomeWork3;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/** Class: ReverseRec
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 31, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class ReverseRec {

	private String orig;
	private String rev;
	private ArrayList<String> revList;
	private ArrayList<String> revWordList;

	public ReverseRec() {

		this.orig = "";
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

		this.orig = str;
		buildList(str);
		pullStrings(this.revList);

	}

	/**
	 * Method: buildList 
	 * @param str String to be reversed
	 * @return String
	 * Method Description: Recursively reverse str and add to revList
	 */
	private String buildList(String str) {

		String orig = str.substring(str.lastIndexOf(" ") + 1);

		this.revList.add(orig);

		if (str.length() - orig.length() - 1 < 0) {
			return str;
		}
		else {
			buildList(str.substring(0, str.length() - orig.length() - 1));
		}

		return orig;
	}

	private String pullStrings(ArrayList<String> list) {

		String rev = "";
		if (list.isEmpty()) {

			return "";
		}
		if (!list.isEmpty()) {

			rev = list.get(0);
			list.remove(0);
		}

		this.revWordList.add(reverseWords(rev));
		pullStrings(list);
		return rev;
	}

	private String reverseWords(String str) {

		if (str.length() - 1 == 0) {

			return str;
		}

		String rev = reverseWords(str.substring(1)) + str.substring(0, 1);

		return rev;
	}

	private String lastChar(String str) {

		if (str.isEmpty()) {

			return "";
		}
		if (str.length() >= 0) {

			return str.substring(str.length() - 1);
		}

		String rev = lastChar(str.substring(str.length() - 2));
		return rev;
	}

	@Override
	public String toString() {

		String str = "";

		str += this.orig + "\n";
		
		for (int i = 0; i < revWordList.size(); i++) {

			if (i == revWordList.size() - 1) {
				str += revWordList.get(i) + "\n";
			}
			else {
				str += revWordList.get(i) + " ";
			}
		}

		return str;
	}
}
