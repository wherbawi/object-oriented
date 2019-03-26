package edu.bethlehem.runners.javafx.basics;

import java.io.File;

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

public class JavaFxUsingPanesImageEg extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new HBox();
		File f = new File("C:\\Users\\wesam\\Documents\\introToProg\\OPCourse\\src\\main\\resources\\opti.png");
		Image e = new Image(f.toURI().toString());
		ImageView iv = new ImageView(e);
		pane.getChildren().add(iv);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
