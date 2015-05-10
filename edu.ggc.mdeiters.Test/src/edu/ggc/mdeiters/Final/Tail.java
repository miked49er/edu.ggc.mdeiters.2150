
package edu.ggc.mdeiters.Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.JFileChooser;

/** Class: Tail
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: May 7, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class Tail {

	public File getFile() {

		JFileChooser chooser = new JFileChooser();
		File file = null;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}

		return file;
	}

	public void readFile() throws MyFileException {

		File file = null;

		try {

			file = getFile();
			FileReader inFile = new FileReader(file);
			Scanner input = new Scanner(inFile);
			Queue<String> que = new LinkedList<String>();

			while (input.hasNext()) {

				que.add(input.nextLine());

				if (que.size() > 5) {

					que.remove();
				}
			}
			printQueue(que);

			inFile.close();

		} catch (FileNotFoundException fnf) {

			throw new MyFileException(file.toString() + " is not found.");

		} catch (IOException ioe) {

		}
	}

	public void printQueue(Queue<String> que) {

		while (!que.isEmpty()) {

			System.out.println(que.remove());
		}
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		Tail tl = new Tail();
		boolean notDone = true;

		while (notDone) {

			try {

				tl.readFile();
				notDone = false;
			} catch (MyFileException mfe) {

				System.out.println(mfe.getMessage());
			}
		}
	}

}
