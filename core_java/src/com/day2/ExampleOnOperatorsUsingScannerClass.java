
package com.day2;

import java.util.Scanner;

public class ExampleOnOperatorsUsingScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a number");
		int a=sc.nextInt();
		System.out.println("enter the b number");
		int b=sc.nextInt();
		
		float c=a+b;
		System.out.println("addition is :"+ c);
		System.out.println("subtraction is :"+(a-b));
		System.out.println("multiplication is :"+(a*b));
		System.out.println("division is :"+(b/a));
		System.out.println("modulus is :"+(a%b));
	}
}
