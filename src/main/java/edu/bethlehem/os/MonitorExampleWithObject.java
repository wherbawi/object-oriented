package edu.bethlehem.os;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MonitorExampleWithObject {
	static MyData data = new MyData();
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(500);
		Runnable task = new Runnable() {
			@Override
			public void run() {
				data.increment();
			}
		};
		for (int i = 0; i < 500; i++) {
			executorService.submit(task);
		}
		executorService.shutdown();
		executorService.awaitTermination(18, TimeUnit.MILLISECONDS);

		System.out.println(data.getA());
	}


}
