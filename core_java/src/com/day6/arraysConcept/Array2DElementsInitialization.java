package com.day6.arraysConcept;

import java.util.Scanner;

public class Array2DElementsInitialization {

	public static void main(String[] args) {

		// declaring the two dimension with with size of 3rows and 3columns =>3*3=9

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row size");

		int rz = sc.nextInt();

		System.out.println("Enter the column size");

		int cz = sc.nextInt();

		// declare the array

		int arr[][] = new int[rz][cz];

		// initialize any two dimension array with help of Scanner

		for (int i = 0; i < rz; i++) {

			for (int j = 0; j < cz; j++) {

				System.out.println("Adding an elements into an array at specific index [" + i + "][" + j + "]");

				arr[i][j] = sc.nextInt();

			}

		}

		System.out.println("Displaying the elements using the for loop");

		for (int i = 0; i < rz; i++) {

			for (int j = 0; j < cz; j++) {

				System.out.print(arr[i][j] + " ");

			}

			System.out.println("");

		}

	}

}
