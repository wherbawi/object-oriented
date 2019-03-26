package edu.bethlehem.runners.javafx.shapes;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CircleTester extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Circle circle = new Circle(100);

		Image image = new Image("file:/C:/Users/wesam/Documents/introToProg/OPCourse/src/main/resources/test.jpg");
		Paint value = new ImagePattern(image);
		circle.setFill(value);
		Pane p = new StackPane();
		p.getChildren().add(circle);

		Label l = new Label("Hello");
		l.setTextFill(Color.WHITE);
		l.setRotate(45);
		Font value2 = new Font("Times New Roman",60);
		l.setFont(value2);
		p.getChildren().add(l);
		Scene scene = new Scene(p, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
