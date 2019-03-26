package edu.bethlehem.os;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	static Semaphore semaphore = new Semaphore(1);
	static int a;

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 500; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					try {
						semaphore.acquire();
					} catch (InterruptedException e) {
					}
					a++;
					semaphore.release();
				}

			});

		}
		executorService.shutdown();
		System.out.println(a);
	}

}
