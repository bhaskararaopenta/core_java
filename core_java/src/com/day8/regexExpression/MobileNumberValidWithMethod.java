package com.day8.regexExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidWithMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		String num = sc.next();

		boolean b = isValidMobileNumber(num);

		if (b) {
			System.out.println("number is valid");
		} else {
			System.out.println("number is not valid");
		}

	}

//	public static boolean isValidMobileNumber(String num) {
//
//		Pattern p = Pattern.compile("[789][0-9]{9}");
//		boolean b = false;
//		Matcher mt = p.matcher(num);
//
//		if (mt.find()) {
//			b = true;
//		} else {
//			b = false;
//		}
//		return b;
//	}

	public static boolean isValidMobileNumber(String num) {
		// public static boolean matches(String regrex,"searchstring")---pattern class
		boolean b = Pattern.matches("[789][0-9]{9}", num);
		return b;
	}

}
