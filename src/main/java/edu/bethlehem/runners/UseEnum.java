package edu.bethlehem.runners;

import edu.bethlehem.domain.Day;
import edu.bethlehem.domain.Person;

public class UseEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(2, "name");
		Day day = Day.MON;
		p.setDayOfBirth(Day.TUES);
		switch (day) {
		case MON:
			
			break;

		default:
			break;
		}
	}

}
