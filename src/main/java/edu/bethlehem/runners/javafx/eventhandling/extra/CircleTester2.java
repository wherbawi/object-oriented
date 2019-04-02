package edu.bethlehem.runners.javafx.eventhandling.extra;

import java.io.File;

import org.lodgon.openmapfx.core.BaseMapProvider;
import org.lodgon.openmapfx.core.DefaultBaseMapProvider;
import org.lodgon.openmapfx.core.LayeredMap;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CircleTester2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BaseMapProvider x = new DefaultBaseMapProvider();
		LayeredMap map = new LayeredMap(x);
	
		Scene scene = new Scene(map, 800, 600);
		stage.setScene(scene);
		stage.show();
		map.setZoom(4);
		map.setCenter(4.2, 50.2);
	}

}
