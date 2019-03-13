package edu.bethlehem.runners;

import java.util.ArrayList;
import java.util.Collections;

import edu.bethlehem.domain.Person;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person(5, ""));
		persons.add(new Person(1, ""));
		persons.add(new Person(2, ""));
		System.out.println(persons.toString());
		Collections.sort(persons);
		System.out.println(persons.toString());
	}

}
