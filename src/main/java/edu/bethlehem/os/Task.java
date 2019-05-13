package edu.bethlehem.os;

import java.util.Random;

class Task implements Runnable {
	String taskName;

	public Task(String name) {
		this.taskName = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep((new Random()).nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done from "+taskName);
	}

}
