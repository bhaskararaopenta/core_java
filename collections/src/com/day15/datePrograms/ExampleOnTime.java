package com.day15.datePrograms;

import java.time.LocalTime;

public class ExampleOnTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		System.out.println("From time extract");

		System.out.println("hOURS :" + lt.getHour());
		System.out.println("minutes :" + lt.getMinute());
		System.out.println("seconds :" + lt.getSecond());
		
		LocalTime lth = lt.plusHours(2);
		System.out.println("Plus added hours :"+lth);
	}

}
