package edu.bethlehem.runners;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myOutFile = new File("C:\\teaching\\readerTest.txt");
		FileWriter fileWriter = null;
		PrintWriter printWriter;
		try {
			fileWriter = new FileWriter(myOutFile, true);
		printWriter=new PrintWriter(fileWriter);
		printWriter.println("k");
			//fileWriter.write("\nfirst write");

			// fileWriter.flush();
		printWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			
		} finally {
			fileWriter.close();
		}

	}

}
