package com.day2;

import java.util.Scanner;

public class ExampleOnSwitchCaseUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';

		do {
			System.out.println("below are the operations u need to perform :- choose ");
			System.out.println("enter 1 for add");
			System.out.println("enter 2 for div");
			System.out.println("enter 3 for mul");
			System.out.println("enter 4 for exit");
			System.out.println("select the option for operation");
			int choice = sc.nextInt();
			
			System.out.println("enter the a number");
			int a = sc.nextInt();

			System.out.println("enter the b number");
			int b = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("sum of the two numbers is :" + (a + b));
				break;

			case 2:
				System.out.println("sum of the two numbers is :" + (a / b));
				break;

			case 3:
				System.out.println("sum of the two numbers is :" + (a * b));
				break;

			case 4:
				System.out.println("exit from the loop");
				ch = 'Y';  
				break;

			default:
				System.out.println("Invalid choosen");
				System.exit(0); // this will help to exit forcefully
				break;
			}

		} while (ch != 'Y'); 
	}

}
