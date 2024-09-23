package com.day6.exceptionHandling;

public class ExampleOnExceptionHandling {

	public static void main(String[] args) {

		System.out.println("--statment1--");

		try {

		int a=10;

		int b=0;

		int quotient = a/b;//it will raise ArithmeticException 

		System.out.println("Division of two numbers is : "+quotient);

		}catch (ArithmeticException e) {

			 //e.printStackTrace();

			//System.err.println(e.getMessage()); //description of the exception

			System.err.println("Denominator cannot be Zero");

		}

		System.out.println("---statement end--");

		System.out.println("End  of the program");


		}
	 
}
