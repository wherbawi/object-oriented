package edu.bethlehem.domain;

public class Employee extends Person {
	private int salary;

	public Employee(int salary) {
	}

	public Employee() {
	}

	public Employee(int id, String name, Address address, int salary) {
		super(id, name, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String whoAmI() {
		return "I am a Emp with name " + getName() + "with salary " + salary;
	}
}
