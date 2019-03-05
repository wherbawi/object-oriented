package edu.bethlehem.runners;

import java.util.ArrayList;

import edu.bethlehem.domain.Employee;
import edu.bethlehem.domain.Person;
import edu.bethlehem.domain.Student;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		
		persons.add(new Student("Saleh", 2, null, 50));
		persons.add(new Person(1, "Taleh"));
		persons.add(new Person(1, "Faleh"));
		persons.add(new Employee(2, "Emp", null, 500));
		
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(4);
		ints.add(3);
		
		ArrayList<Integer> ints2 = new ArrayList<>();
		ints2.add(5);
		ints2.add(6);
		ints2.addAll(ints);
		
		System.out.println(ints.get(6));
		
		for (Person person : persons) {
			System.out.println(person.whoAmI());
		}

		ArrayList<String> strs = new ArrayList<>();

	}

}
