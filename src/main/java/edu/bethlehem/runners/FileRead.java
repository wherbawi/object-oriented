package edu.bethlehem.runners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myInFile = new File("C:\\teaching\\readerTest.txt");
		System.out.println(myInFile.isDirectory());
		try {
			Scanner scanner = new Scanner(myInFile);
			while (scanner.hasNextLine()) {
				String nextLine = scanner.next();
				System.out.println(nextLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
