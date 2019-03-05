package edu.bethlehem.os;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		ServerSocket serverSocket = new ServerSocket(2000);
		while (true) {
			System.out.println("waiting");
		//	Thread.sleep(10000);
			Socket clientSocket = serverSocket.accept();
			System.out.println("received st");
			Scanner scanner = new Scanner(clientSocket.getInputStream());
			System.out.println("got message from client : " + scanner.nextLine());
			PrintStream printWriter = new PrintStream(clientSocket.getOutputStream(), true);
			printWriter.print("hello from server");
			clientSocket.close();
		}
	}

}
