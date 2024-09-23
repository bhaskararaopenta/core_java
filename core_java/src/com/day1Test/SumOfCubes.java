package com.day1Test;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		int totalSum=cubesLogic(number);
		System.out.println(totalSum);
	}

	public static int cubesLogic(int number) {
		int sum=0;
		
		while(number>0) {
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number/=10;
		}
		return sum;
	}

}
