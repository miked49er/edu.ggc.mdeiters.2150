
package edu.ggc.mdeiters.Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/** Class: FileReverse
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 26, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class FileReverse {

	public ArrayList<String> reverseString(ArrayList<String> strList) {

		ArrayList<String> reversed = new ArrayList<String>();
		String rev = "";

		for (int i = 0; i < strList.size(); i++) {
			
			rev = "";
			for (int j = 0; j < strList.get(i).length(); j++) {

				rev += strList.get(i).substring(strList.get(i).length() - j - 1, strList.get(i).length() - j);
			}
			reversed.add(rev);
		}

		return reversed;
	}

	public ArrayList<String> reverseLines(ArrayList<String> strList) {

		ArrayList<String> reversedList = new ArrayList<String>();

		for (int i = 0; i < strList.size(); i++) {

			reversedList.add(strList.get(strList.size() - i - 1));
		}

		return reversedList;
	}

	public ArrayList<String> readFile(File file) {

		FileReader fr = null;
		ArrayList<String> strList = new ArrayList<String>();

		try {
			fr = new FileReader(file);

		} catch (FileNotFoundException fnf) {

			fnf.getMessage();
		}

		Scanner input = new Scanner(fr);

		while (input.hasNext()) {
			strList.add(input.nextLine());
		}

		try {
			fr.close();
		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		}
		return strList;
	}

	public void filePrint(ArrayList<String> strList, File file) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);

		} catch (FileNotFoundException fnf) {

			System.out.println(fnf.getMessage());
		}

		for (int i = 0; i < strList.size(); i++) {

			pw.println(strList.get(i));
		}

		pw.close();
	}

	public static void main(String[] args) {

		FileReverse rev = new FileReverse();
		File file = null;
		File save = null;
		ArrayList<String> strList = new ArrayList<String>();

		file = new File("/home/miked49er/workspace/edu.ggc.mdeiters.Test/src/edu/ggc/mdeiters/Test1/input.txt");
		save = new File("/home/miked49er/workspace/edu.ggc.mdeiters.Test/src/edu/ggc/mdeiters/Test1/output.txt");

		strList = rev.readFile(file);
		strList = rev.reverseLines(strList);
		strList = rev.reverseString(strList);
		rev.filePrint(strList, save);

	}

}
