package edu.bethlehem.runners.javafx.eventhandling.extra;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lab extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gPane = new GridPane();

		Label vName = new Label("Vehicle Name");
		Label vId = new Label("Vehicle ID");

		TextField vNameField = new TextField();
		TextField vIdField = new TextField();
		Button button = new Button("Add Vehicle");
		gPane.setHgap(15);
		gPane.setVgap(15);
		gPane.add(vName, 0, 0);
		gPane.add(vId, 0, 1);
		gPane.add(vNameField, 1, 0);
		gPane.add(vIdField, 1, 1);
		gPane.add(button, 1, 2, 2, 1);

		Scene scene = new Scene(gPane, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
