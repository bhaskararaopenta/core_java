package com.day1Test;

import java.util.Scanner;

public class SumOfDivisibles {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Number");
		int number=scan.nextInt();
		
		int sum=calculateSum(number);
		System.out.println(sum);

	}

	private static int calculateSum(int number) {
		int sum=0;
		for (int i = 0; i <=number; i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
