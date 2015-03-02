
package edu.ggc.mdeiters.IC3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** Class: ReadFile
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 12, 2015
 * 
 * 
 * This will read a text file
 * 
 * Purpose is output each line of a text file to a String ArrayList
 * 
 */
public class ReadFile {

	protected ArrayList<String> fileList;
	private FileReader inFile;

	public ReadFile() {

		this.fileList = new ArrayList<String>();
		this.inFile = null;

	}

	/**
	 * Method: readToArrayList
	 * This will read the file selected to an ArrayList
	 * @param selectedFile file to be read
	 * @return An ArrayList of Strings from a file
	 * @throws FileMissingException
	 */
	public ArrayList<String> readToArrayList(File selectedFile) throws FileMissingException {

		try {

			// Setting the file to the FileReader

			inFile = new FileReader(selectedFile);

			// Creating a Scanner to read the FileReader

			Scanner input = new Scanner(inFile);

			while (input.hasNext()) { // Adds each line of the file to the ArrayList fileList

				fileList.add(input.nextLine());
			}

			inFile.close();
		} catch (FileNotFoundException fnf) {
			throw new FileMissingException("I can't find the file you want to read.");
		} catch (IOException ioe) {

		}
		return fileList;
	}

	/**
	 * Method: readFile
	 * @param file that the user wants to read
	 * @return ArrayList of the Strings from the file
	 */
	public ArrayList<String> readFile(File file) {

		return readToArrayList(file);
	}

	/**
	 * Method: readFile
	 * This will take the String location of the file to read and create newFile to pass into the readToArrayList method
	 * @param string of the file location
	 * @return the ArrayList of the Strings from then file
	 */
	public ArrayList<String> readFile(String file) {

		File newFile = new File(file);
		return readToArrayList(newFile);
	}

	/**
	 * @return the fileList
	 */
	public ArrayList<String> getFileList() {

		return fileList;
	}

}
