package com.day15.datePrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateReadingUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date (YYYY-MM-dd)");

		String udt = sc.next();

		// converting the string udt into date format using loaclDate parse

		LocalDate d = LocalDate.parse(udt);

		// custom format --> MM/dd/YYYY using Date Formatter

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String custFt = df.format(d);
		System.out.println("Custom Format :" + custFt);
	}

}
