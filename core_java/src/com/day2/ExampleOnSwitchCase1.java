package com.day2;

import java.util.Scanner;

public class ExampleOnSwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a number");
		int a = sc.nextInt();

		System.out.println("enter the b number");
		int b = sc.nextInt();

		System.out.println("choose the operation : + , / , * ");
		String ch = sc.next();

		switch (ch) {
		case "+":
			System.out.println("sum of the two numbers is :" + (a + b));
			break;

		case "/":
			System.out.println("sum of the two numbers is :" + (a / b));
			break;
			
		case "*":
			System.out.println("sum of the two numbers is :" + (a * b));
			break;
			
		default:
			System.out.println("Invalid choosen");
			break;
		}

	}

}
