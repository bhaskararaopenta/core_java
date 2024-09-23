package com.day6.arraysConcept;

import java.util.Scanner;

public class InitializeVariablesUsingScannerToArray {

	public static void main(String[] args) {

		// declare an array with size of five elements and add the elements using
		// scanner.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size: ");

		int sz = sc.nextInt();

		int arr[] = new int[sz];

		// Initialize an array with help scanner

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the array element at specific index [" + i + "] :");

			arr[i] = sc.nextInt();

		}

		System.out.println("Displaying the elements from an array using for loop : ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

		System.out.println("");

		System.out.println("Displaying the elements from an array using enhanced for loop ");

		for (int ar : arr) {

			System.out.print(ar + "|");

		}

	}

}
