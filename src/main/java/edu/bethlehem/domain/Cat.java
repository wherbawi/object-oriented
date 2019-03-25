package edu.bethlehem.domain;

public  class Cat extends Animal implements Edible{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "up to u";
	}



	@Override
	public String doSound() {
		return "Miao";
	}

}
