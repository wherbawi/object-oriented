package edu.bethlehem.generics;

import java.util.ArrayList;

public class StackGeneric<E> {
	private ArrayList<E> elements = new ArrayList<>();

	public void push(E element) {
		elements.add(element);
	}

	public E pop() {
		return elements.remove(elements.size() - 1);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}
}
