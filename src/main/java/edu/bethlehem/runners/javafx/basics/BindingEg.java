package edu.bethlehem.runners.javafx.basics;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingEg {

	public static void main(String[] args) {
		DoubleProperty x = new SimpleDoubleProperty(6);
		DoubleProperty y = new SimpleDoubleProperty(6);
		y.bind(x);
		x.set(4);
		System.out.println(y.doubleValue());
	}

}
