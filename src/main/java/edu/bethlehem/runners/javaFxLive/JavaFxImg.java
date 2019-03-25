package edu.bethlehem.runners.javaFxLive;

import java.io.File;

import javax.crypto.spec.IvParameterSpec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxImg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		//File f = new File("C:\\Users\\wesam\\Documents\\introToProg\\OPCourse\\src\\main\\resources\\opti.png");
		//System.out.println(f.toURI().toString());
		Image image = new Image("file:/C:/Users/wesam/Documents/introToProg/OPCourse/src/main/resources/opti.png");
		ImageView imageView = new ImageView(image);
		pane.getChildren().add(imageView);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
