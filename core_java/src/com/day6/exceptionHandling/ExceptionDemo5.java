package com.day6.exceptionHandling;
import java.util.InputMismatchException;

import java.util.Scanner;
 
public class ExceptionDemo5 {
 
    public static void division(int a,int b) {

		int quotient=a/b;

        System.out.println("Division of two number is : "+quotient);

	}

	public static void main(String[] args) {

		System.out.println("statement1");

		Scanner input = new Scanner(System.in);

		try {

		int a= input.nextInt();

		int b = input.nextInt();//call

		ExceptionDemo5.division(a, b); /*

										 * main()->division() 

										 * // main()<-division();

										 * calling method will return thrown exception from

										 * called method we need to handle the exception using try,catch

										 */	

	    //instead handling multiple catch blocks we can handle in single catch handle(from Jdk 1.7)

		//handle it by separated by '|'

		}catch (ArithmeticException | InputMismatchException  e) {

			e.printStackTrace();

		}							 

		System.out.println("Rest of the code..");

		System.out.println("end of the program");

	}

 
}

 
