package com.day6.testOnException2ndWay;

import java.util.Scanner;

public class ExampleOnValidFirstNameAndLastName {

	public static void validName(String fname, String lname) throws NameException {

		if (fname.isEmpty() || lname.isEmpty()) {

			throw new NameException("First or Last Name is Blank");

		} else {

			System.out.println("FullName is : " + fname + " " + lname);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String fn = sc.nextLine();

		String ln = sc.nextLine();

		try {

			ExampleOnValidFirstNameAndLastName.validName(fn, ln);

		} catch (NameException e) {

			System.err.println(e.getMessage());

		}

	}

}
