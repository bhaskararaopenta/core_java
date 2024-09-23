package com.day8.regexExpression;

import java.util.regex.Pattern;

public class SplitMethodsInTwoWays {

	public static void main(String[] args) {
		String msg = "welcome to java";
		String s[] = msg.split("\\s");
		for (String st : s) {
			System.out.println(st);
		}

		
		System.out.println("------------------");
		
		Pattern p = Pattern.compile("\\s");
		String[] st = p.split("welcome to java");
		
		System.out.println("after convert the line to words using split() of pattern class");
		for (String str : st) {
			System.out.println(st);
		}
		
	}

}
