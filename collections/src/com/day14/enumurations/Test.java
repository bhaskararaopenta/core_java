package com.day14.enumurations;

public class Test {

	public static void main(String[] args) {
		
		EnumClass shape = EnumClass.TRIANGLE;
		
		 EnumClass s = shape.TRIANGLE;
		System.out.println(s);
		
		int position = s.ordinal();
		System.out.println("The position is :"+position);

	}
}
