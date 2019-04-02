package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.KeyEvent;

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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextFiledEvent extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("click here!");
		TextField txt1 = new TextField();
		VBox vbox = new VBox();
		vbox.getChildren().addAll(txt1, button);
		Scene scene = new Scene(vbox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

		txt1.setOnAction(event -> {
			button.setText("hi");
			System.out.println(txt1.getText());
		});

		EventHandler eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(txt1.getText());
			}
		};
		button.setOnAction(eventHandler);


	}

}
