package edu.bethlehem.domain;

public class Student extends Person {
	private double gpa;

	public Student() {

	}

	public Student(String name, int id, Address address, double gpa) {
		super(id, name, address);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String whoAmI() {
		return "I am a Student with name " + getName() + "with gpa " + gpa;
	}
}
