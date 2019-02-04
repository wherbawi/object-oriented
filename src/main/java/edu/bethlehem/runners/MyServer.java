package edu.bethlehem.runners;

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
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(2000);
		while (true) {
			System.out.println("waiting");
			Socket clientSocket = serverSocket.accept();
			System.out.println("I am here");
			Scanner scanner = new Scanner(clientSocket.getInputStream());
			System.out.println("got message from client : " + scanner.nextLine());
			PrintStream printWriter = new PrintStream(clientSocket.getOutputStream(), true);
			printWriter.print("hello from server");
			clientSocket.close();
		}
	}

}
