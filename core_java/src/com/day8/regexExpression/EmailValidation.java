package com.day8.regexExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the email ");
		String email = sc.next();

		boolean b = isValidName(email);

		if (b) {
			System.out.println("email is valid");
		} else {
			System.out.println("email is not valid");
		}

	}

	public static boolean isValidName(String email) {

		Pattern p = Pattern.compile("[a-zA-Z][@-zA-Z0-9-,]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		boolean b = false;
		Matcher mt = p.matcher(email);

		if (mt.find()) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

}
