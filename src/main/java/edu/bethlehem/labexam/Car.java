package edu.bethlehem.labexam;

public class Car extends Vehicle {
	String fuelType;

	public Car(int speed, int numberOfPassengers, String fuelType) {
		super(speed, numberOfPassengers);
		this.fuelType = fuelType;
	}

	@Override
	public void move() {
		getLocation().setX(getLocation().getX() + 3 * getDirection());
	}

}
