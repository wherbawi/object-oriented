package edu.bethlehem.runners.threads;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterThread {

	static int counter;

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			while (true) {
				counter++;
				System.out.println(counter);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		t.start();
		
		System.out.println("hello");
		Scanner s = new Scanner(System.in);
		while(s.nextInt()!=0) {
			System.out.println("user entered non zero");
		}
	}

}
