
package edu.ggc.mdeiters.Test1;

import java.util.ArrayList;

/** Class: PetTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 26, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */
public class PetTester {

	public static void main(String[] args) {

		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		pets.add(new Cat("Mitten","Siamese","grey",true,15));
		pets.add(new Cat("Tim","Maine Coon Cat","tabby",25,4));
		pets.add(new Dog("Dusty", "Golden Retriever", "gold", true,"large", 95));
		pets.add(new Dog("Bailey", "Yorkee", "white", false,"small", 25));
		pets.add(new Rodent("Squeaky", "hamster", "brown", 4, 1, true));
		pets.add(new Rodent("Oinker", "pig", "pink", 4, 100, false));
		
		for (int i=0; i<pets.size(); i++) {
			
			System.out.println(pets.get(i).toString());
			System.out.println(pets.get(i).eats());
		}
	}
}
