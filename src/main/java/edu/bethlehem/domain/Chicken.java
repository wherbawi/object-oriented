package edu.bethlehem.domain;

public class Chicken implements Edible, Cloneable {

	@Override
	public String howToEat() {
		return "cook or raw";
	}

}
