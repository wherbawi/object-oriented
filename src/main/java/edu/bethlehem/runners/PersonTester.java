package edu.bethlehem.runners;

import edu.bethlehem.domain.Address;
import edu.bethlehem.domain.Person;

public class PersonTester {

	public static void main(String[] args) {
		Address address = new Address("street1", "house1", "bethlehem");
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "Ali");
		p1.setAddress(address);
		Address address2 = p1.getAddress();
		address2.setCity("Ramallah");
		System.out.println(address2.getHouseNo());

	}

}
