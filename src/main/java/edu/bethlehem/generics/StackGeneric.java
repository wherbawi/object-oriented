package edu.bethlehem.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackGeneric<X> {
	private ArrayList<X> elements = new ArrayList<X>();

	/**
	 * this method is blah blah
	 * 
	 * @param element
	 */
	public void push(X element) {
		elements.add(element);
	}

	public X pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return elements.remove(elements.size() - 1);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}

}
