package com.day6.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleOnHaving2Exceptions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("--statment1--");

		try {
			System.out.println("pla enter a value");
			int a = input.nextInt();
			System.out.println("pls enter b value");
			int b = input.nextInt();

			int quotient = a / b;// it will raise ArithmeticException

			System.out.println("Division of two numbers is : " + quotient);

		} catch (ArithmeticException e) {

			// e.printStackTrace();-->it will print Name of the exception and description
			// and Location of the exception

			// System.err.println(e.getMessage()); //description of the exception

			System.err.println("Denominator cannot be Zero");

		} catch (InputMismatchException ie) {

			System.err.println("Input must be an Integer Type");

		}

		System.out.println("---statement end--");

		System.out.println("End  of the program");

	}

}
