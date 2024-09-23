package com.day6.Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class CheckSecondSmallestNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		// initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array element at specific index [" + i + "] :");

			arr[i] = sc.nextInt();
		}

		// display

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// checking second smallest

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(" ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println(" ");
		
		
		
	}
}
