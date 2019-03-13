package edu.bethlehem.runners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class FileT {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\teaching//test2.txt");
		System.out.println(file.length());
		PrintWriter printWriter = null;
		FileWriter fileWriter = new FileWriter(file,true);
		PrintWriter printWriter2 = new PrintWriter(file);
		fileWriter.write("hello\n");
		fileWriter.write("world\n");
		fileWriter.flush();
	}

}
