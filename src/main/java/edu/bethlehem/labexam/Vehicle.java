package edu.bethlehem.labexam;

public abstract class Vehicle {
	private int speed;
	private int numberOfPassengers;
	private Location location;
	private int direction;

	public Vehicle(int speed, int numberOfPassengers) {
		super();
		this.speed = speed;
		this.numberOfPassengers = numberOfPassengers;
	}

	public void changeDirection() {
		direction = -direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public abstract void move();

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
}
