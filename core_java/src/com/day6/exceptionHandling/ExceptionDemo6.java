package com.day6.exceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo6 {

	public static void division(int a, int b) {

		int quotient = a / b;

		System.out.println("Division of two number is : " + quotient);

	}

	public static void main(String[] args) {

		System.out.println("statement1");

		Scanner input = new Scanner(System.in);

		try {

			int a = input.nextInt();

			int b = input.nextInt();// call

			ExceptionDemo6.division(a, b);

		} catch (ArithmeticException | InputMismatchException e) {

			e.printStackTrace();

		} finally {

			System.out.println("we are in finally block -is ment for closing all resources");

			input.close();// closing Scanner object

		}

		System.out.println("Rest of the code..");

		System.out.println("end of the program");

	}

}
