package IC1;
/**
 * Address
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written January 27, 2015
 * 
 * 
 * This will return to a string an address
 * 
 * Purpose to create an instances of an address
 * 
 */
public class Address {
	
	private String $name;
	private String $street;
	private String $city;
	private String $state;
	private String $zip;
	
	/**
	 * @param $name
	 * @param $street
	 * @param $city
	 * @param $state
	 * @param $zip
	 */
	public Address() {
		this.$name ="";
		this.$street = "";
		this.$city = "";
		this.$state = "";
		this.$zip = "";
	}

	/**
	 * Address
	 * @param $newName
	 * @param $newStreet
	 * @param $newCity
	 * @param $newState
	 * @param $newZip
	 * This sets the values
	 */
	public Address(String $name, String $street, String $city, String $state, String $zip) {
		this.$name = $name;
		this.$street = $street;
		this.$city = $city;
		this.$state = $state;
		this.$zip = $zip;
	}


	/**
	 * @return the $name
	 */
	public String get$name() {
		return $name;
	}


	/**
	 * @param $name the $name to set
	 */
	public void set$name(String $name) {
		this.$name = $name;
	}


	/**
	 * @return the $street
	 */
	public String get$street() {
		return $street;
	}


	/**
	 * @param $street the $street to set
	 */
	public void set$street(String $street) {
		this.$street = $street;
	}


	/**
	 * @return the $city
	 */
	public String get$city() {
		return $city;
	}


	/**
	 * @param $city the $city to set
	 */
	public void set$city(String $city) {
		this.$city = $city;
	}


	/**
	 * @return the $state
	 */
	public String get$state() {
		return $state;
	}


	/**
	 * @param $state the $state to set
	 */
	public void set$state(String $state) {
		this.$state = $state;
	}


	/**
	 * @return the $zip
	 */
	public String get$zip() {
		return $zip;
	}


	/**
	 * @param $zip the $zip to set
	 */
	public void set$zip(String $zip) {
		this.$zip = $zip;
	}
	
	/**
	 * toString
	 * @return String
	 * This will return the data in a string
	 */
	public String toString() {
		String $result = $name + "\n" +
					$street + "\n" +
					$city + ", " + $state + " " + $zip;
		return $result;
	}
	
}
