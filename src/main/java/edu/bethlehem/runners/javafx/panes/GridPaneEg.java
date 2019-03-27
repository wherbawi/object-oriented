package edu.bethlehem.runners.javafx.panes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridPaneEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gPane = new GridPane();
		Button button = new Button("click Here!");
		Button button2 = new Button("click Here2!");
		Label label = new Label("this is a label");
		TextField field = new TextField();
		
		gPane.setGridLinesVisible(true);
		gPane.add(button, 0, 0);
		gPane.add(label, 1, 0);
		gPane.add(button2, 2, 0);
		gPane.add(field, 2, 1);
		gPane.setHgap(20);
		gPane.setVgap(50);

		Scene scene = new Scene(gPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
