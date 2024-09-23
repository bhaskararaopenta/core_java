package com.day1Test;
//
//import java.util.Scanner;
//
//public class RangePrimeNumber {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the number");
//		int number = scan.nextInt();
//
//		
//		for (int i = 2; i <= number; i++) {
//			int count=0;
//			for (int j = 1; j <=i; j++) {
//				 if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
//	}
//
//}
//
//

import java.util.Scanner;

public class RangePrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scan.nextInt();
		
		for (int i = 2; i <= number; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for (int j = 2; j < num; j++) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
	}
}