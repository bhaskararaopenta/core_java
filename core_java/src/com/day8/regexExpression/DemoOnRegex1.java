package com.day8.regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// this program referes (if condition checks only first occurance only)
public class DemoOnRegex1 {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("ab"); // here we need to write pattern (regular expression)

		String m = "abababababababab"; // here we need to write th search string based on pattern

		
		Matcher mt = p.matcher(m);

		if (mt.find()) {
			System.out.println("match found at start and end index:" + mt.start() + "----" + mt.end());
			System.out.println(mt.group());
			
		}else {
			System.out.println("not found");
		}
		
	}
}
