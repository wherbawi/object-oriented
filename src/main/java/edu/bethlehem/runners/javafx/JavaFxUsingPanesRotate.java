package edu.bethlehem.runners.javafx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxUsingPanesRotate extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Button e = new Button("hello");
		pane.getChildren().add(e);
		pane.getChildren().add(new Button("hi"));
		pane.setRotate(45);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
