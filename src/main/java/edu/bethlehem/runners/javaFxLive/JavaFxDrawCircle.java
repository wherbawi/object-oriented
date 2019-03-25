package edu.bethlehem.runners.javaFxLive;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFxDrawCircle extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle(50);
		StackPane pane = new StackPane();
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
