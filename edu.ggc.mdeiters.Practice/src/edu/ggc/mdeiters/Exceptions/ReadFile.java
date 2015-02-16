
package edu.ggc.mdeiters.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/** Class: ReadFile
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 10, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class ReadFile {

	/** Method: main
	 * This will 
	 * @param args
	 */
	public static void main(String[] args) {

		File inFile = new File("C:\\Users\\miked49er\\Google Drive\\Java\\2150\\practice\\src\\exceptions\\ReadFile.java");
		FileReader fr = null;
		
		try {
			fr = new FileReader(inFile);
			Scanner input = new Scanner(fr);
			
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			throw new Exception("new exception");
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("In FileNotFound catch");
			System.out.println(fnf.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("In Exception catch");
			System.out.println(e.getMessage());
			
		}
		finally
		{
			System.out.println("In the finally");
			try
			{
				fr.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}

	}
}
