package edu.bethlehem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person implements Comparable<Person> {

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	private int id;
	private String name;

	private Address address;
	private Day dayOfBirth;

	@Override
	public boolean equals(Object obj) {

		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person() {

	}

	public Person(int i, String name) {
		this.id = i;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String whoAmI() {
		return "I am a person with name " + name;
	}

	@Override
	public int compareTo(Person o) {
		return id - o.getId();
	}

	public Day getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Day dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

}
