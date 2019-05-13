package edu.bethlehem.runners.threads;

import java.util.Scanner;

public class CountAndAskUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Runnable wt = new Runnable() {

			@Override
			public void run() {
				int counter = 0;
				while (true) {
					System.out.println(counter++);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		Thread t = new Thread(wt);
		t.start();
		Scanner scanner = new Scanner(System.in);

		while (scanner.nextInt() != 0) {
			System.out.println("hello");
		}

	}

}
