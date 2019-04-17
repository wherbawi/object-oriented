package edu.bethlehem.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackGeneric<E> {
	private ArrayList<E> elements = new ArrayList<>();

	/**
	 * this method is blah blah
	 * @param element
	 */
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
