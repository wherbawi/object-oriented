package edu.bethlehem.generics;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTogether s = new StackTogether();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		StackTogetherString s2 = new StackTogetherString();
		s2.push("el");
		
		StackGeneric<Integer> intStack = new StackGeneric<>();
		intStack.push(20);
		Integer pop = intStack.pop();
		StackGeneric<String> strStack = new StackGeneric<>();
		strStack.push("d");
		
	}

	
}
