package edu.ggc.mdeiters.IC1;
import javax.swing.JOptionPane;

/**
 * AddressTester
 * 
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: January 27, 2015
 * 
 * 
 * This will create addresses and add them to the addressbook
 * 
 * Purpose to test the Address and AddressBook classes 
 * 
 */
public class AddressTester {

	public static void main(String[] args) {

		AddressBook $address = new AddressBook();
		AddressTester $at = new AddressTester();

		while ($at.setAddress($address));

		$at.printAddresses($address);

		System.exit(0);
	}

	/**
	 * setAddress
	 * 
	 * @param $ad
	 * @return boolean 
	 * This will create an addresses
	 */
	private boolean setAddress(AddressBook $ad) {
		String $namePrompt = "Please enter the name for the address book \n(Just press enter to stop adding addresses)";
		String $name = JOptionPane.showInputDialog($namePrompt);
		if ($name.isEmpty()) {
			return false;
		}

		String $streetPrompt = "Please enter the street for " + $name;
		String $street = JOptionPane.showInputDialog($streetPrompt);

		String $cityPrompt = "Please enter the city for " + $name;
		String $city = JOptionPane.showInputDialog($cityPrompt);

		String $statePrompt = "Please enter the state for " + $name;
		String $state = JOptionPane.showInputDialog($statePrompt);

		String $zipPrompt = "Please enter the zip for " + $name;
		String $zip = JOptionPane.showInputDialog($zipPrompt);

		$ad.setAddress($name, $street, $city, $state, $zip);

		return true;
	}

	/**
	 * printAddresses
	 * 
	 * @param $ad
	 * @return void 
	 * This will print the array returned from the getAllAddress() constructor
	 */
	private void printAddresses(AddressBook $ad) {
		String $addresses = "";
		for (int i = 0; i < $ad.getAllAddress().length; i++) {
			$addresses += $ad.getAllAddress()[i] + "\n\n";
		}
		JOptionPane.showMessageDialog(null, $addresses);
	}

}
