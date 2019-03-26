package edu.bethlehem.runners.javafx.panes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FlowPaneEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane fPane = new FlowPane(Orientation.VERTICAL);
		Button button = new Button("click Here!");
		Button button2 = new Button("click Here2!");
		Label label = new Label("this is a label");
		TextField field = new TextField();
		fPane.getChildren().add(button);
		fPane.getChildren().add(label);
		fPane.getChildren().add(button2);
		fPane.getChildren().add(field);
		Scene scene = new Scene(fPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
