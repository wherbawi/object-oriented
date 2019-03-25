package edu.bethlehem.domain;

public class Std extends Per1 {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Per1 o) {
		return grade - ((Std) o).getGrade();
	}

}
