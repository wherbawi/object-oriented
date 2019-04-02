package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventEg1 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text txt = new Text(200, 200, "initial");
		Pane pane = new Pane();
		pane.getChildren().add(txt);
		Scene scene = new Scene(pane, 500, 500);
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				if (event.getCode() == KeyCode.UP)
					txt.setY(txt.getY() -10);
				if (event.getCode() == KeyCode.DOWN)
					txt.setY(txt.getY() +10);
				System.out.println(event.getCode());

			}
		});
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
