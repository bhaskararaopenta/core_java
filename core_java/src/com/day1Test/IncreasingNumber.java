package com.day1Test;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		boolean result= enteredNumber(number);
		System.out.println(result);

	}

	private static Boolean enteredNumber(int number) {
		int firstNumber=number%10;
		number/=10;
		
		while (number>0) {
			int secondNumber=number%10;
			if(secondNumber > firstNumber) {
				return false;
			}
			firstNumber=secondNumber;
			number/=10;
		}
		return true;
	}

}
