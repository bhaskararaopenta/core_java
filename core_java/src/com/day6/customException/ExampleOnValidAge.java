package com.day6.customException;

import java.util.Scanner;

public class ExampleOnValidAge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();

		try {

			if (age < 18) {

				throw new InvalidAgeException("Age is less than 18 .Not valid age to vote");

			} else {

				System.out.println("Age is valid to caste a vote");

			}

		} catch (InvalidAgeException e) {

			System.err.println(e.getMessage());

		} finally {

			input.close();

		}

	}

}
