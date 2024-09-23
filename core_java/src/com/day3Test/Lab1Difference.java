package com.day3Test;

import java.util.Scanner;

public class Lab1Difference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = scan.nextInt();

		int result = sumOfSquares(n) - squaresOfSum(n);
		System.out.println(result);

	}

	public static int squaresOfSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i * i;
		}
		return sum;
	}

	public static int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}
		return sum * sum;
	}

}
