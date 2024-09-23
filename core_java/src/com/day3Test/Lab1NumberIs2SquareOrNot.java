package com.day3Test;

import java.util.Scanner;

public class Lab1NumberIs2SquareOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number");
		int number = scan.nextInt();

		boolean result = check(number);
		System.out.println(result);

	}

	public static boolean check(int number) {
		while (number % 2 == 0) {
			number /= 2;
		}
		if (number == 1) {
			return true;
		} else
			return false;
	}

}
