package edu.bethlehem.runners.javafx.panes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class shapesEg2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane p = new StackPane();
		Rectangle r1 = new Rectangle(100,300);
		Rectangle r2 = new Rectangle(100,300);
		Rectangle r3 = new Rectangle(100,300);
		Rectangle r4 = new Rectangle(100,300);
		r2.setRotate(90);
		r3.setRotate(45);
		r4.setRotate(-45);
		p.getChildren().add(r1);
		p.getChildren().add(r2);
		p.getChildren().add(r3);
		p.getChildren().add(r4);
		Scene scene = new Scene(p, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
