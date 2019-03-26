package edu.bethlehem.runners.javafx.basics;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CircleWithFont extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Circle circle = new Circle(45, 45, 300);
		circle.setStroke(Color.RED);
		Paint fill = new Color(0.8, 0.2, 0.1, 1);
		Paint fill2 = new ImagePattern(new Image(new File("src\\main\\resources\\test.jpg").toURI().toString()));
		circle.setFill(fill2);
		Label label = new Label("My Circle");
		Font font = new Font("Times New Roman", 50);
		label.setFont(font);
		label.setTextFill(Color.WHITE);
		label.setRotate(45);

		Pane stackPane = new StackPane();
		stackPane.getChildren().add(circle);
		stackPane.getChildren().add(label);
		Scene scene = new Scene(stackPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
