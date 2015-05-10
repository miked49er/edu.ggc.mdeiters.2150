
package edu.ggc.mdeiters.Final;

import java.util.LinkedList;
import java.util.ListIterator;

public class PersonTester {

	public static void main(String[] args) {

		PersonTester pt = new PersonTester();

		LinkedList<Person> people = new LinkedList<Person>();
		people.add(new Person("Tom", 25));
		people.add(new Person("Sally", 35));
		people.add(new Person("Jane", 45));
		people.add(new Person("Fred", 22));
		people.add(new Person("Harry", 23));
		people.add(new Person("Jim", 28));
		people.add(new Person("Steve", 25));
		people.add(new Person("Jenny", 21));
		people.add(new Person("Mike", 18));
		people.add(new Person("Jenny", 12));
		people.add(new Person("Ralph", 22));
		people.add(new Person("Monica", 7));
		people.add(new Person("Cheryl", 22));
		people.add(new Person("Jimmy", 13));
		people.add(new Person("Ed", 18));
		people.add(new Person("Joanna", 19));
		people.add(new Person("Sarah", 22));
		people.add(new Person("Tommy", 8));
		people.add(new Person("Tim", 10));

		pt.printPeople(people);

		System.out.println("\nRemoving underage people.\n");

		pt.printPeople(pt.rmUnderAge(people));
	}

	public LinkedList<Person> rmUnderAge(LinkedList<Person> list) {

		ListIterator<Person> iter = list.listIterator();

		while (iter.hasNext()) {

			if (iter.next().getAge() < 18) {

				iter.remove();
			}
		}

		return list;
	}

	public <T> void printPeople(LinkedList<T> list) {

		ListIterator<T> iter = list.listIterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}
	}

}
