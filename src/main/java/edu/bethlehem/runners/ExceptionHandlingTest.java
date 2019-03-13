package edu.bethlehem.runners;

import java.io.IOException;
import java.rmi.AccessException;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doNewCrazy();
		try {
			doCheckedException();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		double r = 0;

		try {
			doCrazy(5, 0);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Here " + e.toString());
		} finally {
			System.out.println("this is the finally block");
		}

		System.out.println(r);

	}

	private static void doCheckedException() throws IOException {
		throw new IOException("");
	}

	private static void doNewCrazy() {
		throw new ArithmeticException("ae");
	}

	private static void doCrazy(int i, int j) {
		try {
			int x = i / j;
		} catch (Exception e) {
			throw new ArithmeticException("j cannot be 0");
		} finally {
			System.out.println("Maen");
		}
		System.out.println("Maen Complains");
	}

	private static double divide(int i, int j) {
		if (j == 0)
			throw new ArithmeticException("j cannot be 0");

		return i / j;
	}

}
