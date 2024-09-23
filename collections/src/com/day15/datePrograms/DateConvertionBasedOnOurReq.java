package com.day15.datePrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvertionBasedOnOurReq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Read data in string using d/MM/YYYY");
		String dt = sc.next(); // 16/03/2024

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		// convert String to locatDate

		LocalDate localDate = LocalDate.parse(dt, formatter);
		System.out.println(localDate);
		sc.close();
	}

}




//Patterns
//
//Let us have a look at the pattern syntax that should be used for the formatting pattern.
// 
//
//Letter for Pattern	Date or Time component					Examples
//y			Year						2018 (yyyy), 18 (yy)
//M			Month in year				July (MMMM), Jul (MMM), 07 (MM)
//w			Results in week in year				16
//W			Results in week in month			3
//D			Gives the day count in the year			266
//d			Day of the month				09 (dd), 9(d)
//F			Day of the week in month			4
//E			Day name in the week				Tuesday, Tue
//a			AM or PM marker	AM
//H			Hour in the day 				(0-23)	12
//k			Hour in the day 				(1-24)	23
//K			Hour in am/pm for 12 hour format (0-11)			0
//h			Hour in am/pm for 12 hour format (1-12)			12
//m			Minute in the hour					59
//s			Second in the minute					35
//S			Millisecond in the minute				978
