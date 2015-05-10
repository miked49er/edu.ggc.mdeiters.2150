
package edu.ggc.mdeiters.Final;

import java.util.ArrayList;

/** Class: PetTester
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
public class PetTester {

	public void genPets() {

		ArrayList<Object> pets = new ArrayList<Object>();

		for (int i = 0; i < 10; i++) {

			double rand = Math.random();

			if (rand % 2 > 0.5) {

				pets.add(new Dog());
			} else {

				pets.add(new Cat());
			}
		}

		printPets(pets);
	}

	public void printPets(ArrayList<Object> pets) {

		for (Object pet : pets) {

			System.out.println(pet.toString());
		}
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		PetTester pt = new PetTester();
		pt.genPets();
	}

}
