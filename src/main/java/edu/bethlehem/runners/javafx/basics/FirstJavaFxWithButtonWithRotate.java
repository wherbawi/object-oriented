package edu.bethlehem.runners.javafx.basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstJavaFxWithButtonWithRotate extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Click here");
		Button button2 = new Button("another");
		StackPane pane = new StackPane();
		pane.getChildren().add(button);
		pane.getChildren().add(button2);
		Scene scene = new Scene(pane, 500, 500);
		pane.setRotate(45);
		button.setMaxHeight(200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Our First Stage");
		primaryStage.show();

	}

}
