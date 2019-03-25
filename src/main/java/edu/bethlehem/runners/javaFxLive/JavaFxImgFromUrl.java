package edu.bethlehem.runners.javaFxLive;

import java.io.File;
import java.net.URL;

import javax.crypto.spec.IvParameterSpec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxImgFromUrl extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		//File f = new File("C:\\Users\\wesam\\Documents\\introToProg\\OPCourse\\src\\main\\resources\\opti.png");
		//System.out.println(f.toURI().toString());
		URL url = new URL("https://timedotcom.files.wordpress.com/2017/11/earth-nasa-gif.gif");
		Image image = new Image(url.openStream());
		ImageView imageView = new ImageView(image);
		pane.getChildren().add(imageView);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
