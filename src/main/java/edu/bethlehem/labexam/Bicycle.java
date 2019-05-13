package edu.bethlehem.labexam;

public class Bicycle extends Vehicle {
	private String type;

	public Bicycle(int speed, int numberOfPassengers, String type) {
		super(speed, numberOfPassengers);
		this.type = type;
	}

	@Override
	public void move() {
		getLocation().setX(getLocation().getX() + 1 * getDirection());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
