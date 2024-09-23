package com.day5.test;

import java.util.Scanner;

public class Calculator implements AdvancedArithmetic {

	@Override
	public void divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = scan.nextInt();
		
		Calculator cal = new Calculator();
		cal.divisorSum(n);
	}

}
