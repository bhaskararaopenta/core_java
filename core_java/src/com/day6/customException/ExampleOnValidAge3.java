package com.day6.customException;

import java.util.Scanner;

public class ExampleOnValidAge3 {

	public static void validAge(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("Age is not valid to caste a vote");

		} else {

			System.out.println("Age is valid to cast a vote");

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ae = sc.nextInt();

		try {

			ExampleOnValidAge3.validAge(ae);

		} catch (InvalidAgeException e) {

			System.err.println(e.getMessage());

		}

	}

}
