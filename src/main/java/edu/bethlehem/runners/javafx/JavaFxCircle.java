package edu.bethlehem.runners.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFxCircle extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 400, 400);
		Circle circle = new Circle(50);
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
