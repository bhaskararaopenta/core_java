package com.day15.datePrograms;

import java.time.LocalDate;

public class ExampleOnDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		System.out.println("From date");
		System.out.println("Day :" + ld.getDayOfMonth());
		System.out.println("Month :" + ld.getMonthValue());
		System.out.println("Month :" + ld.getMonth());
		System.out.println("Year :" + ld.getYear());

		LocalDate dt = ld.plusDays(10); //plus 10 days adding
		System.out.println(dt); //2024-09-30
		
		LocalDate dtm = ld.plusMonths(3); //plus 3 months added from current day
		System.out.println(dtm); // 2024-12-20
		
		LocalDate dtw = ld.plusWeeks(2);
		System.out.println(dtw);  //2024-10-04
		
		LocalDate dty = ld.plusYears(2);
		System.out.println(dty); // 20-09-2026
		
		LocalDate ltm = ld.minusMonths(3); // previous months
		System.out.println(ltm);   
	}

}
