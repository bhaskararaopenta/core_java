package com.day6.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {
	 
    public static void division(int a,int b) {

		int quotient=a/b;

        System.out.println("Division of two number is : "+quotient);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {

		int a= input.nextInt();

		int b = input.nextInt();//call

	    ExceptionDemo4.division(a,b);  //main()->division() //calling method will return thrown exception from

	                                    //called method we need to handle the exception using try,catch

		}catch (ArithmeticException ae) {

			System.err.println("Denmonitor cannot be zero");

			//ae.printStackTrace();

		}catch (InputMismatchException ime) {

			System.err.println("Input Must Be Integer");

		}								 // main()<-division();

	}

 
}

 
