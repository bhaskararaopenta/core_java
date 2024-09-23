package com.day5.Assignment5;

public class Programmer extends Employee {

	double salary;
	double experienceInYears;
	String language;

	public Programmer(String empName, double salary, double experienceInYears, String language) {
		super(empName);
		this.salary = salary;
		this.experienceInYears = experienceInYears;
		this.language = language;
	}

	@Override
	public double calculateSalary() {
		return salary;
	}

	@Override
	public void displayInfo() {
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(experienceInYears);
		System.out.println(language);
	}

}
