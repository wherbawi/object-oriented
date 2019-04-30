package edu.bethlehem.runners.javafx;

import java.awt.Panel;
import java.lang.reflect.Field;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sun.misc.Unsafe;

public class GifEg extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image image = new Image("file:/C:/Users/wesam/Downloads/bird.gif");
		ImageView imageView = new ImageView(image);
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);

		int pageSize = unsafe.pageSize();
		System.out.println("Page size: " + pageSize);
		Pane root = new Pane();
		root.getChildren().add(imageView);
		Scene value = new Scene(root);
		value.setOnKeyPressed(e -> {
			imageView.setX(imageView.getX() + 20);
		});
		primaryStage.setScene(value);
		primaryStage.show();

	}

}
