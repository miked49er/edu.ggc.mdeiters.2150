package stringBuilder;
import java.util.Scanner;

/** CheckingPalindromes
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Jan 29, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class CheckingPalindromes {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string to test if it is a palindrome.");
		str.append(input.next());
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		
		if (str.toString().equals(str2.reverse().toString())) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		
	}
}
