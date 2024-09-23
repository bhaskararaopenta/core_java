package com.day8.regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoOnRegex2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab"); // here we need to write pattern (regular expression)

		String m = "abababababababab"; // here we need to write th search string based on pattern

		int count = 0;
		Matcher mt = p.matcher(m);

		while (mt.find()) {
			System.out.println("match found at start and end index:" + mt.start() + "----" + mt.end());
			System.out.println(mt.group());
			System.out.println(count++); 
		}
	}

}
