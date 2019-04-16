package edu.bethlehem.generics;

import java.util.ArrayList;

public class StackTogether {
	private ArrayList<Integer> elements = new ArrayList<>();

	public void push(Integer element) {
		elements.add(element);
	}

	public Integer pop() {
		return elements.remove(elements.size() - 1);
	}
	
	public boolean isEmpty() {
		return elements.isEmpty();
	}
}
