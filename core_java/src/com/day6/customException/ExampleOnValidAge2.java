package com.day6.customException;

import java.util.Scanner;

public class ExampleOnValidAge2 {

	public static void validAge(int age) {

		try {

		if(age<18) {

			throw new InvalidAgeException("Age is not valid to caste a vote");

		}else {

			System.out.println("Age is valid to cast a vote");

		}

		}catch (InvalidAgeException e) {

			System.err.println(e.getMessage());

		}

	}
 
	

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int ae = sc.nextInt();

		ExampleOnValidAge2.validAge(ae);


	}
 
}

 
