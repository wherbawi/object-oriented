package edu.bethlehem.domain;

public abstract class Per1 implements Comparable<Per1> {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Per1 o) {
		return age - o.getAge();
	}


}
