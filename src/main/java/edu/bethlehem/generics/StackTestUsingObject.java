package edu.bethlehem.generics;

public class StackTestUsingObject {

	public static void main(String[] args) {

		StackGenericObject intStack = new StackGenericObject();
		intStack.push(20);
		intStack.push("hi");
		Integer pop = (Integer)intStack.pop();
		System.out.println(pop);

	}

}
