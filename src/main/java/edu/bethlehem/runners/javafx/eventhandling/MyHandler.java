package edu.bethlehem.runners.javafx.eventhandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("hello " + event.getSource().toString());
	}

}
