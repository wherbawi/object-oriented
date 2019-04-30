package edu.bethlehem.runners.Intersection;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BoundaryIntersection extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image image = new Image("file:C:\\Users\\wesam\\Downloads/bird.gif");
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(image);
		imageView.setX(100);
		imageView.setY(100);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);

		Rectangle rectangle = new Rectangle(120, 120, 50, 50);
		Pane p = new Pane();
		p.getChildren().add(imageView);
		p.getChildren().add(rectangle);
		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.show();
		boolean intersects = rectangle.getLayoutBounds().intersects(imageView.getLayoutBounds());
		System.out.println(intersects);

	}

}
