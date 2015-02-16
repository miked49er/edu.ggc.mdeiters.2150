package stringBuilder;
import javax.swing.JOptionPane;

/** StringBuilderTester
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
public class StringBuilderTester {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		
		str.append("java");
		JOptionPane.showMessageDialog(null, str);
		JOptionPane.showMessageDialog(null, str.capacity());

		str.insert(0, "Welcome ");
		JOptionPane.showMessageDialog(null, str);
	}

}
