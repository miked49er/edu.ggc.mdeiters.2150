
package IC3;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/** Class: SelectFile
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 14, 2015
 * 
 * 
 * This will allow the user to select a file to be read to the console and to a file. As well as reverse the file.
 * 
 * Purpose is read and write files the user selects
 * 
 */
public class SelectFile {

	/**
	 * Method: select
	 * This will allow the user to choose a file they want to read
	 * @param chooser JFileChooser to select the file to be read
	 * @return the file that the user choose
	 */
	public File select(JFileChooser chooser) {

		File selected = null;

		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

			// New file that the user selected

			selected = chooser.getSelectedFile();
		} else {

			System.exit(0);
		}

		return selected;
	}

	/**
	 * Method: save
	 * This will allow the user to choose where they want to save the file they are writing. 
	 * @param chooser JFileChooser to select where the new file should be saved
	 * @return the file location that the user choose
	 */
	public File save(JFileChooser chooser) {

		File selected = null;

		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

			// Save file location that the user selected

			selected = chooser.getSelectedFile();
		} else {

			System.exit(0);
		}

		return selected;
	}

	/**
	 * Method: reverse
	 * This will reverse the ArrayList 
	 * @param strList ArrayList of the file
	 * @return the reversed ArrayList
	 */
	public ArrayList<String> reverse(ArrayList<String> strList) {

		ArrayList<String> reversed = new ArrayList<String>();

		for (int i = 0; i < strList.size(); i++) {

			// Adding the last items of strList to the beginning of reversed ArrayLists

			reversed.add(strList.get(strList.size() - 1 - i));
		}

		return reversed;
	}

	/**
	 * Method: output
	 * This will print the ArrayList to the console 
	 * @param strList ArrayList of the file
	 * @return void
	 */
	public void output(ArrayList<String> strList) {

		for (int i = 0; i < strList.size(); i++) {

			System.out.println(strList.get(i));
		}
	}

	/**
	 * Method: printFile
	 * This will write the ArrayList to the selected location 
	 * @param strList ArrayList of the file
	 * @param chooser JFileChooser to pass to save method
	 * @return void
	 */
	public void printFile(ArrayList<String> strList, JFileChooser chooser) {

		WriteFile wf = new WriteFile();
		File saveFile = null;
		boolean notDone = false;

		// Boolean that is used to test if an exception is thrown to loop

		do {
			try {

				output(strList);

				// Selects where to save the file

				saveFile = save(chooser);

				// Calls the WriteFile class to output the contents of the file to a file

				wf = new WriteFile(strList, saveFile);

			} catch (FileMissingException fme) {

				System.out.println(fme.getMessage());
				JOptionPane.showMessageDialog(null, fme.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Please select where to save the file");

				// Exception was thrown, therefore a loop needs to occur

				notDone = true;
			}
		} while (notDone);
	}

	public static void main(String[] args) {

		SelectFile sf = new SelectFile();
		JFileChooser chooser = new JFileChooser();
		File selectedFile = null;

		ReadFile rf = new ReadFile();
		ArrayList<String> strList = new ArrayList<String>();
		boolean notDone = false;

		JOptionPane.showMessageDialog(null, "Please select a text(.txt, .java) file to read");

		// Boolean that is used to test if an exception is thrown to loop

		do {
			try {

				// Selects the file to be read

				selectedFile = sf.select(chooser);

				// Calls the readFile method from the ReadFile class to output an ArrayList

				strList = rf.readFile(selectedFile);

			} catch (FileMissingException fme) {

				System.out.println(fme.getMessage());
				JOptionPane.showMessageDialog(null, fme.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Please select a text(.txt, .java) file to read");

				// Exception was thrown, therefore a loop needs to occur

				notDone = true;
			}
		} while (notDone);

		JOptionPane.showMessageDialog(null, "Please select where to save the file");
		sf.printFile(strList, chooser);

		System.out.println("\n===================================\n");
		System.out.println("The Reversed File");
		System.out.println("\n===================================\n");
		JOptionPane.showMessageDialog(null, "Please select where to save the reversed file");
		sf.printFile(sf.reverse(strList), chooser);

		System.out.println("\n===================================\n");
		System.out.println("The Reverse of the Reversed File");
		System.out.println("\n===================================\n");
		JOptionPane.showMessageDialog(null, "Please select where to save the reverse of the reverse file");
		sf.printFile(sf.reverse(sf.reverse(strList)), chooser);

		System.exit(0);

	}
}
