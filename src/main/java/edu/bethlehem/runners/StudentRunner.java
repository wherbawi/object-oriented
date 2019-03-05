package edu.bethlehem.runners;

import edu.bethlehem.domain.Address;
import edu.bethlehem.domain.Employee;
import edu.bethlehem.domain.Person;
import edu.bethlehem.domain.Student;

public class StudentRunner {

	public static void main(String[] args) {

		Address addressNew = new Address("str1", "33b", "b");
		Student sNew = new Student("Samio", 2, addressNew, 3.5);
		
		System.out.println(sNew.whoAmI());

		Person s = new Student();
		Person s2 = new Employee();

		Student z = new Student();
		Person p = z;
		Student s3;
		Employee s4;
		if (s instanceof Employee)
			s4 = (Employee) s;

		if (s instanceof Student)
			s3 = (Student) s;

		System.out.println(((Student) s).getGpa());
		s.setId(2);
		Address address = new Address("str1", "5b", "b");
		s.setAddress(address);
		System.out.println(s.getId());

	}

}
