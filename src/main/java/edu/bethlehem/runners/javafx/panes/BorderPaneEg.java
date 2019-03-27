package edu.bethlehem.runners.javafx.panes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
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

public class BorderPaneEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bPane = new BorderPane();
		StackPane topStackPane = new StackPane();
		StackPane leftStackPane = new StackPane();

		Button button = new Button("click Here!");
		Button button2 = new Button("click Here!");
		Label label = new Label("this is a label");
		TextField field = new TextField();

		topStackPane.getChildren().add(button);
		leftStackPane.getChildren().add(button2);
		Button btnLeft = new Button("button 6");
		btnLeft.setPrefWidth(200);
		
		bPane.setTop(topStackPane);
		bPane.setBottom(field);
		bPane.setLeft(btnLeft);
		bPane.setAlignment(btnLeft, Pos.CENTER);
		bPane.setRight(new Button("button 3"));
		bPane.setCenter(label);
		//bPane.setRight(new Button("button 4"));
		Scene scene = new Scene(bPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
