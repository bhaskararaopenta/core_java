package com.day15.datePrograms;

import java.time.LocalDateTime;

public class ExampleOnDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println("From Date extract ");
		System.out.println("Day :"+ ldt.getDayOfMonth());
		System.out.println("Month :"+ ldt.getMonth());
		System.out.println("Year :"+ ldt.getYear());
		
		System.out.println();
		System.out.println("From time extract");
		System.out.println("hours :"+ ldt.getHour());
		System.out.println("Minutes :"+ ldt.getMinute());
		System.out.println("Seconds :"+ ldt.getSecond());
		
		
	}

	
}
