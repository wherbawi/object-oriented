package edu.bethlehem.runners;

import java.time.LocalDate;
import java.time.Period;

public class DateTester {

	public static void main(String[] args) {
		LocalDate db = LocalDate.of(2000, 06, 24);
		Period diff = Period.between(LocalDate.now(), db);
		System.out.println(diff);
	}

}
