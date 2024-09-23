package com.day8.regexExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidateStartWithAa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		String name = sc.next();

		boolean b = isValidName(name);

		if (b) {
			System.out.println("name is valid");
		} else {
			System.out.println("name is not valid");
		}

	}

	public static boolean isValidName(String name) {

		Pattern p = Pattern.compile("[aA][a-zA-Z]{5,7}");
		boolean b = false;
		Matcher mt = p.matcher(name);

		if (mt.find()) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

}
