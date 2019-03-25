package edu.bethlehem.runners.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFxEg1 extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("hello");
		Scene scene = new Scene(button, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First FX");
		primaryStage.show();
		
		Stage stage =new Stage();
		
		stage.setScene(new Scene(new Button("hello2"),300,300));
		stage.show();

	}

}
