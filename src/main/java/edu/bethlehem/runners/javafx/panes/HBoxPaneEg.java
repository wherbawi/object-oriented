package edu.bethlehem.runners.javafx.panes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HBoxPaneEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbPane = new HBox();
		hbPane.setAlignment(Pos.CENTER_LEFT);
		// gPane.setGridLinesVisible(true);
		Button button = new Button("click Here!");
		Button button2 = new Button("click Here!");
		Label label = new Label("this is a label");
		TextField field = new TextField();
		hbPane.getChildren().addAll(button,button2,label);
		Scene scene = new Scene(hbPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}
