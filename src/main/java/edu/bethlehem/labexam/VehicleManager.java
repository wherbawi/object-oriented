package edu.bethlehem.labexam;

public class VehicleManager {

	public static void main(String[] args) {
		Car car = new Car(10, 1, "Diesel");
		Bicycle bike = new Bicycle(2, 1, "Mountain bike");
		car.setLocation(new Location(0, 0));
		bike.setLocation(new Location(0, 0));
		car.setDirection(1);
		bike.setDirection(1);
		car.move();
		car.move();
		car.move();
		bike.move();
		bike.move();
		bike.move();

		car.changeDirection();
		bike.changeDirection();
		car.move();
		bike.move();

		System.out.println(car.getLocation().getX() + "," + car.getLocation().getY());
		System.out.println(bike.getLocation().getX() + "," + bike.getLocation().getY());
	}

}
