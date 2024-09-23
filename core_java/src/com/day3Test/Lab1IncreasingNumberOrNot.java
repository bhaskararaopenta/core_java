package com.day3Test;

import java.util.Scanner;

public class Lab1IncreasingNumberOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Number");
		int number = scan.nextInt();

		boolean sum = checkNumber(number);
		if (sum == true) {
			System.out.println("the number is increasing");
		} else {
			System.out.println("not a increasing");
		}

	}

	public static boolean checkNumber(int number) {
		int firstNumber = number % 10;
		number /= 10;

		while (number > 0) {
			int secondNumber = number % 10;
			if (secondNumber > firstNumber) {
				return false;
			}
			firstNumber = secondNumber;
			number /= 10;
		}
		return true;
	}

//	public static boolean checkNumber(int n) {
//		boolean b = false;
//
//		while (n > 0) {
//			int ldt=n%10;
//			n=n/10;
//			int ndt=n%10;
//			if(ndt<ldt) {
//				b=true;
//			}else {
//				b=false;
//				break;
//			}
//		}
//		return b;
//	}

}
