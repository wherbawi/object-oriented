package edu.bethlehem.os;

import java.util.Scanner;

public class ServerSimulation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		while (scanner.nextInt() != 0) {
			Task task = new Task("t " + counter++);
			Thread thread = new Thread(task);
			thread.start();
			System.out.println("ready for new task");
		}
	}

}
