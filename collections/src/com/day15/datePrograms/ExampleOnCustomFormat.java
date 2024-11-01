package com.day15.datePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleOnCustomFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now();
		System.out.println("current date :"+d); // 2024-09-20
		
		//custom format date   ---> YYYY/MM/dd
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String custDate = dateTimeFormatter.format(d);
		System.out.println(custDate);
		

	}

}
