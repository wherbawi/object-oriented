package edu.bethlehem.runners;

import java.util.ArrayList;

import edu.bethlehem.domain.Animal;
import edu.bethlehem.domain.Cat;
import edu.bethlehem.domain.Edible;
import edu.bethlehem.domain.Hund;

public class AbstractTester {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Cat("x"));
		animals.add(new Hund("z"));
	//	Edible cat = new Cat("");
		for (Animal animal : animals) {
			System.out.println(animal.doSound());
		}
	}

}
