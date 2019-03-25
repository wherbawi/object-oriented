package edu.bethlehem.runners;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://bethlehem.edu/");
		Scanner scanner = new Scanner(url.openStream());
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
			
		}
	
	}

}
