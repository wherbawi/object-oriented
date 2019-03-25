package edu.bethlehem.runners;

import edu.bethlehem.domain.Std;

public class ReviewLect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std std = new Std();
		Std std2 = new Std();
		std.setAge(50);
		std.setGrade(40);
		std2.setGrade(50);
		std2.setAge(80);
		System.out.println(std.compareTo(std2));

	}

}
