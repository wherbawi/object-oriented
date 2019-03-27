package edu.bethlehem.runners.javafx.eventhandling;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsYouWant4 extends Application {
	ArrayList<String> st = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("click Hee");
		TextField t = new TextField();

		button.setOnAction(event -> {
			System.out.println(t.getText());
			t.setText("b clicked");
			st.add(t.getText());

		});
		FlowPane p = new FlowPane();
		p.getChildren().addAll(button, t);
		Scene scene = new Scene(p, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
