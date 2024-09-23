package com.day8.regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidateBasedOnRegex {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[789][0-9]{9}"); // here we need to write pattern (regular expression)

		String m = "7993658669"; // here we need to write th search string based on pattern

		Matcher mt = p.matcher(m);

		if (mt.find()) {
			System.out.println("number is valid");

		} else {
			System.out.println("number is not valid");
		}
	}
}
