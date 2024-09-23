package com.day7.assignmentOnArrays;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pls enter the size");
		
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
	}
}
