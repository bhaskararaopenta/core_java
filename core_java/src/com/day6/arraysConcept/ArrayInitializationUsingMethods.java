package com.day6.arraysConcept;

public class ArrayInitializationUsingMethods {

	public static void methodOne(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	public static String[] displayFruits() {
		String fruits[] = { "mango", "apple", "pineapple", "kiwi" };
		return fruits;

	}

	public static void main(String[] args) {
		int arr[] = { 30, 40, 65, 12, 10 };
		ArrayInitializationUsingMethods.methodOne(arr);
		System.out.println(" ");
		String ft[] = ArrayInitializationUsingMethods.displayFruits();
		for (String f : ft) {
			System.out.print(f + " ");
		}

	}

}
