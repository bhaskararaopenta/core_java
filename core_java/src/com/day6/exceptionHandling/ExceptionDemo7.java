package com.day6.exceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo7 {
	 
    public static void division(int a,int b) {

		int quotient=a/b;

        System.out.println("Division of two number is : "+quotient);

	}

	public static void main(String[] args) {

		System.out.println("statement1");

		//try with resources

		try(Scanner input = new Scanner(System.in))

	    {

		int a= input.nextInt();

		int b = input.nextInt();//call

		ExceptionDemo7.division(a, b); 

		}catch (ArithmeticException | InputMismatchException  e) {

			e.printStackTrace();

		}					 

		System.out.println("Rest of the code..");

		System.out.println("end of the program");

	}

 
}
 
