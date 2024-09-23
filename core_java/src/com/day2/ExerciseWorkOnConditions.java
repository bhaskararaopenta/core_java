package com.day2;

import java.util.Scanner;

public class ExerciseWorkOnConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a number");
		int a=sc.nextInt();
		System.out.println("enter the b number");
		int b=sc.nextInt();
		System.out.println("enter the c number");
		int c=sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("a is greater");
		} else if (b>c && b>a) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		} 
	}

}
