package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import java.awt.event.MouseAdapter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
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
		Button button1 = new Button("button 1");
		Button button2 = new Button("button 2");
		TextField txt = new TextField();
		TextField txt2 = new TextField();
		BorderPane borderPane = new BorderPane();

		EventHandler eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (event.getSource().equals(button1)) {
					System.out.println("button 1 clicked");
					System.out.println(txt.getText());
				}
				if (event.getSource().equals(button2))
					System.out.println("button 2 clicked");

			}
		};

		button1.setOnAction(eventHandler);
		button2.setOnAction(eventHandler);
		borderPane.setLeft(button1);
		borderPane.setBottom(button2);
		borderPane.setCenter(txt);
		borderPane.setRight(txt2);
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
