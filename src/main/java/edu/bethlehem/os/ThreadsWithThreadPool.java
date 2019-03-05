package edu.bethlehem.os;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadsWithThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(20);
		for (int i = 0; i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter a message");
			String s = scanner.nextLine();
			executorService.submit(new Task(s));
		};
		boolean finished = executorService.awaitTermination(1, TimeUnit.MINUTES);
	}

}
