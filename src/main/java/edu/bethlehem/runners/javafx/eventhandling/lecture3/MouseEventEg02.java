package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.KeyEvent;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventEg02 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text txt = new Text(200, 200, "initial");
		Circle circle = new Circle(200, 200, 50);
		Pane pane = new Pane();
		pane.getChildren().addAll(txt,circle);
		Scene scene = new Scene(pane, 500, 500);
		scene.setOnMouseMoved(e -> {
			txt.setText(e.getSceneX() + " " + e.getSceneY());
			circle.setCenterX(e.getSceneX());
			circle.setCenterY(e.getSceneY());
		});
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
