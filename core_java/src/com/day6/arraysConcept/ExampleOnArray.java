package com.day6.arraysConcept;

public class ExampleOnArray {

	public static void main(String[] args) {

		// declare and initialize the array .

		int arr[] = { 20, 40, 10, 24, 50 };

		System.out.println("No of elements in an array : " + arr.length);

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
