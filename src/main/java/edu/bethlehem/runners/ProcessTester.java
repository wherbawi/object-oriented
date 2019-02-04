package edu.bethlehem.runners;

import java.io.IOException;

public class ProcessTester {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ProcessBuilder builder = new ProcessBuilder("notepad.exe");
		Process pro = builder.start();
		// wait x seconds`
		System.out.println("I did not stop Noor");
		System.out.println("Waiting");
		Thread.sleep(20000);

		// kill the process
		pro.destroy();
		System.out.println("Process destroyed");
	}

}
