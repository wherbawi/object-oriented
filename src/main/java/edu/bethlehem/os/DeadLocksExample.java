package edu.bethlehem.os;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLocksExample {
	static int a = 0;
	static Lock lock = new ReentrantLock();
	static Lock lock2 = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			lock.lock();
			lock2.lock();
			a++;
			lock2.unlock();
			lock.unlock();
		});
		
		Thread t2 = new Thread(() -> {
			lock2.lock();
			lock.lock();
			a++;
			lock.unlock();
			lock2.unlock();
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("hello no deadlock");
		System.out.println(a);
	}

}
