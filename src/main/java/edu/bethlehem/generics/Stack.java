package edu.bethlehem.generics;

import java.util.ArrayList;

import sun.security.ec.ECDHKeyAgreement;

public class Stack<T> {
	T[] e = (T[]) new Object[10];
	ArrayList<T> list = new ArrayList<>();

	public void push(T element) {
		list.add(element);
		e[0] = element;
	}

	public T pop() {
		return list.get(0);
	}

	public static void main(String[] a) {
		Stack<String> st = new Stack<>();
		st.push("r");
	}
}
