package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.KeyEvent;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(100, 50);
		Circle circle = new Circle(200, 200, 50);
		Pane pane = new Pane();
		pane.getChildren().addAll(rec, circle);
		Scene scene = new Scene(pane, 500, 500);
		PathTransition pt = new PathTransition(Duration.seconds(3), circle, rec);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(false);
		pt.play();
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
