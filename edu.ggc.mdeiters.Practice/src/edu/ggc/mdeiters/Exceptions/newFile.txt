package Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;



/** Class: FileWriter
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 12, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class FileWriter {
	
	public static void main (String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\miked49er\\Google Drive\\Java\\2150\\practice\\src\\exceptions\\newFile.txt");
		
		pw.println("This is the first line of the text file.");
		pw.println("This is the second line");
		pw.close();
		
		System.out.println("File writing is complete.");
	}
	
}
