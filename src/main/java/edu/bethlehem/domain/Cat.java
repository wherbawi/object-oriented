package edu.bethlehem.domain;

public class Cat extends Animal implements Edible{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Miaw";
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "up to u";
	}

}
