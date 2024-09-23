package com.day8.stringPrograms;

public class StringMatchesMethod {

	public static void main(String[] args) {
		String wrds="java";
		
		boolean b = wrds.matches("j..a$");
		
		System.out.println("search string is found or not ? : "+b);
		
		System.out.println("--------------");
		
		String regex="[789]\\d{9}";
		String mb="7993678669";
		
		boolean b1 = mb.matches(regex);
		
		System.out.println("mobile number is valid or not ? :"+b1);

	}

}
