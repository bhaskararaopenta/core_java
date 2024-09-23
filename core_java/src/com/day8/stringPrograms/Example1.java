package com.day8.stringPrograms;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string value");
		String word=sc.nextLine();
		
		System.out.println("enter the first index");
		
		int a=sc.nextInt();
		
		System.out.println("enter the second index");
		
		int b=sc.nextInt();
		
		System.out.println(word.substring(a, b)); 
	}
}
