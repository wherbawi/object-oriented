package edu.bethlehem.os;

import java.util.Scanner;

public class ThreadsTester {

	public static void main(String[] args) throws InterruptedException {
		Thread ourThread;

		Thread x = new Thread(() -> {
			System.out.println("this is lambda run java 8");
		});
		x.start();
		Thread t = new Thread(new Task("t1"));
		t.start();
		Thread t2 = new Thread(new Task("t2"));
		t2.start();
		Thread t3 = new Thread(new Task("t3"));
		t3.start();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter a message");
			String s = scanner.nextLine();
			ourThread = new Thread(new Task(s));
			ourThread.start();
			// t.join();
		}
	}



}
