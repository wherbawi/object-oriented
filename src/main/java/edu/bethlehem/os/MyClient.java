package edu.bethlehem.os;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Integer x = 50;
		int z = 20;
		z = x;
		x = z;
		int parseInt = Integer.parseInt("5");

		Socket socket = new Socket("127.0.0.1", 2100);
		PrintStream printWriter = new PrintStream(socket.getOutputStream(), true);
		printWriter.println("hello from client");
		Scanner scanner = new Scanner(socket.getInputStream());
		System.out.println(" got message from server: " + scanner.nextLine());
		socket.close();

	}

}
