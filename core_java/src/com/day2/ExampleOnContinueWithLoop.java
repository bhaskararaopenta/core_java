package com.day2;

import java.util.Scanner;

public class ExampleOnContinueWithLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		int i = 1;
		// it will skip the  number
//		while (i <= 10) {
//			if (i == 5) {
//				i++;
//				continue;
//			}
//			System.out.print(i + " ");
//			i++;
//		}
		
		
		// it will skip the 2 numbers
		while (i <= 10) {
			if (i == 5) {
				i+=2;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}

	}

}
