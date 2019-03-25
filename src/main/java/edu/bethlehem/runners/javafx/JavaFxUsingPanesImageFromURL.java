package edu.bethlehem.runners.javafx;

import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxUsingPanesImageFromURL extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new HBox();
		URL url = new URL("https://timedotcom.files.wordpress.com/2017/11/earth-nasa-gif.gif");
		Image e = new Image(url.openStream());
		ImageView iv = new ImageView(e);
		pane.getChildren().add(iv);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setHeight(1000);
		primaryStage.setWidth(1000);
		primaryStage.show();
	}

}
