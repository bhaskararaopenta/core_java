package com.day5.Assignment5;

public class MainClass {

	public static void main(String[] args) {
		Manager m=new Manager("Siva", 4, 80000);
		m.displayInfo();
		System.out.println("salary for manager : "+m.calculateSalary());
		
		
		Programmer p=new Programmer("Sivaaaa", 100000, 6, "java");
		p.displayInfo();
		System.out.println("salary for Programmer"+p.calculateSalary());
		
	}
}
