package com.day2;

import java.util.Scanner;

//public class ExampleOnWhileLoop {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int n = sc.nextInt();
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(n + "X" + i + "=" + n * i);
//			i++;
//		}
//	}
//
//}

public class ExampleOnLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i=1;

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(n + "x" + i + "=" + n * i);
//		}
		
		do {
			System.out.println(n + "x" + i + "=" + n * i);
			i++;
		} while (i<=10);
	}
}
