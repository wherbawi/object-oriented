package edu.bethlehem.generics;

import java.util.ArrayList;

public class StackTogetherString {
	private ArrayList<String> elements = new ArrayList<>();

	public void push(String element) {
		elements.add(element);
	}

	public String pop() {
		return elements.remove(elements.size() - 1);
	}
	
	public boolean isEmpty() {
		return elements.isEmpty();
	}
}
