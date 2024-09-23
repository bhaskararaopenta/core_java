package com.day14.enumurations;

//enum is to represent group of constants
//these constants are static and final constant
enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class ExampleOnEnum {

	public static void main(String[] args) {
		Days d = Days.FRIDAY;
		System.out.println(d);
		
		int position = d.ordinal();
		System.out.println("position of constant is :"+position);
		
		String enumName = d.name();
		System.out.println(enumName);
		
		Days[] list = Days.values();
		System.out.println("enums are");
		for (Days days : list) {
			System.out.println(days);
		}
		System.out.println("by using for loop");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
