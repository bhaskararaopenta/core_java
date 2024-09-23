package com.day6.exceptionHandling;

public class ExampleOnExceptionHandling2 {

	public static void division(int a, int b) {
		try {
			int quotient = a / b;
			System.out.println("Division of two number is : " + quotient);
		} catch (ArithmeticException ae) {
			System.err.println("Denmonitor cannot be zero");
			// ae.printStackTrace();
		}
	}

	public static void main(String[] args) { // call
		ExampleOnExceptionHandling2.division(10, 0); // main()->division()
		// main()<-divsion();
	}

}
