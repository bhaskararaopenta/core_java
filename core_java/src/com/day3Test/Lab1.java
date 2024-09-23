package com.day3Test;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = scan.nextInt();

		int sum = calculateSum(n);
		System.out.println(sum);
	}

	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
 
}
