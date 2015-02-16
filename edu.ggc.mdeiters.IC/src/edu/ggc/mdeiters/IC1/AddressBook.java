package edu.ggc.mdeiters.IC1;
import java.util.ArrayList;

/**
 * AddressBook
 * 
 * @author Mike Deiters
 * @verison 1.1
 * ITEC 2150 Spring 2015
 * Written: January 27, 2015
 * 
 * 
 * This will create a new address and add it to $addressList
 *
 * Purpose to create an addressbook
 * 
 */
public class AddressBook {
	
	private ArrayList<Address> $addressList;
	
	public AddressBook() {
		$addressList = new ArrayList<Address>();
	}
	
	/**
	 * getAllAddress
	 * @return String[] $adds
	 * This will create a String[] called $adds from the $addressList
	 */
	public String[] getAllAddress() {
		int $count = 0;
		String[] $adds = new String[$addressList.size()];
		for (Address $curAddress : $addressList) {
			$adds[$count++] = $curAddress.toString();
		}
		return $adds;
	}
	
	/**
	 * setAddress
	 * @param $name
	 * @param $street
	 * @param $city
	 * @param $state
	 * @param $zip
	 * @return void
	 * This will create a new address and add it to $addressList
	 */
	public void setAddress(String $name, String $street, String $city, String $state, String $zip) {
		$addressList.add(new Address($name, $street, $city, $state, $zip));
	}
	
}
