package edu.bethlehem.runners;

import java.util.ArrayList;

import edu.bethlehem.domain.Apple;
import edu.bethlehem.domain.Chicken;
import edu.bethlehem.domain.Edible;

public class InterfaceTester {

	public static void main(String[] args) {
		ArrayList<Edible> e = new ArrayList<>();
		e.add(new Chicken());
		e.add(new Apple());
		for (Edible edible : e) {
			System.out.println(edible.howToEat());
		}

	}

}
