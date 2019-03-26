package edu.bethlehem.runners.javafx.eventhandling;


import java.awt.event.MouseAdapter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonClickEvent extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("click here!");
		TextField txt = new TextField();
		TextField txt2 = new TextField();
		BorderPane borderPane = new BorderPane();
		
		EventHandler eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				txt2.setText(txt.getText());
				System.out.println(txt.getText());
				
			}
		};

		button.setOnAction(eventHandler);
		borderPane.setLeft(button);
		borderPane.setCenter(txt);
		borderPane.setRight(txt2);
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	


}
