package edu.bethlehem.runners.javafx.eventhandling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsYouWant2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("click Hee");
		EventHandler<ActionEvent> value = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("hello");
			}
		};
		button.setOnAction(value);
		Pane p = new Pane();
		p.getChildren().add(button);
		Scene scene = new Scene(p, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
