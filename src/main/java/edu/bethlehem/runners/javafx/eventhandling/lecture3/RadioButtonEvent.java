package edu.bethlehem.runners.javafx.eventhandling.lecture3;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.KeyEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonEvent extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("click here!");
		TextField txt1 = new TextField();
		// ToggleGroup group = new ToggleGroup();
		HBox hBox = new HBox();
		RadioButton redRadio = new RadioButton("Red");
		// redRadio.setToggleGroup(group);
		redRadio.setSelected(true);
		RadioButton greenRadio = new RadioButton("Green");
		// greenRadio.setToggleGroup(group);
		hBox.getChildren().addAll(redRadio, greenRadio);
		VBox vbox = new VBox();
		vbox.getChildren().addAll(hBox, txt1, button);
		Scene scene = new Scene(vbox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

		greenRadio.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				button.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

			}
		});

		redRadio.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				button.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));

			}
		});
		txt1.setOnAction(event -> {
			button.setText("hi");
			System.out.println(txt1.getText());
		});

		EventHandler eventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(txt1.getText());
			}
		};
		button.setOnAction(eventHandler);

	}

}
