package edu.bethlehem.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] ints = new Integer[3];
		ints[0]=10;
		ints[1]=20;
		String[] strs = new String[3];
		strs[0]="h";
		print(ints);
		print(strs);

		List<String> x = new ArrayList<>();
		x.add("d");
	
		Comparable<Date> c = new Date();
		
	}

	private static <E> void print(E[] ints) {
	
		for (E e : ints) {
			System.out.println(e);
		}
	}

}
