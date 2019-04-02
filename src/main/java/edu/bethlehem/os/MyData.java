package edu.bethlehem.os;

public class MyData {
	private int a = 0;

	public synchronized void increment() {
		a += 1;
	}

	public int getA() {
		return a;
	}

}
