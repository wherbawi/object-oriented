package edu.bethlehem.runners;

import edu.bethlehem.domain.Address;
import edu.bethlehem.domain.Employee;
import edu.bethlehem.domain.Person;
import edu.bethlehem.domain.Student;

public class InheritanceLect2 {

	public static void main(String[] args) {
		Address a = new Address("f", "c", "B");

		Address addressNew = new Address("str1", "33b", "b");
		Student sNew = new Student("Samio", 2, addressNew, 3.5);
		Person p = new Student("X", 2, addressNew, 2.5);

		Person p1 = new Employee(2, "X", addressNew, 2);

		System.out.println(p.whoAmI());
		System.out.println(p1.whoAmI());

		Person[] persons = new Person[3];
		persons[0] = new Person(2, "geor");
		persons[1] = new Student("w", 2, new Address("str1", "h1", "b"), 2.5);
		persons[2] = new Employee(2, "w", new Address("str1", "h1", "b"), 2);

		for (Person person : persons) {
			System.out.println(person.whoAmI());
		}
	}

}
