package edu.bethlehem.os;

public class MyData {
	private int a = 0;

	public synchronized void increment() {
		setA(getA() + 1);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
