package com.day1Test;

import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scan.nextInt();

		int finalDifference = individalSquares(number) - wholeSquare(number);
		System.out.println(finalDifference);

	}

	public static int wholeSquare(int number) {
		int result = 0;
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
			result = sum * sum;
		}

		return result;
	}

	public static int individalSquares(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + (i * i);
		}
		return sum;
	}

}
