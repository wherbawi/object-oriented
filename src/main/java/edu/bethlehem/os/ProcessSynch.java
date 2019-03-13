package edu.bethlehem.os;

public class ProcessSynch {
	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
			for (int i = 0; i < 100; i++) {
				counter++;
				//System.out.println(Thread.currentThread().getName() + " " + counter);
			}
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter);

	}
}
