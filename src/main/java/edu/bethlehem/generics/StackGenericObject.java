package edu.bethlehem.generics;

import java.util.ArrayList;

public class StackGenericObject {
	private ArrayList<Object> elements = new ArrayList<>();

	public void push(Object element) {
		elements.add(element);
	}

	public Object pop() {
		return elements.remove(elements.size() - 1);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}
}
