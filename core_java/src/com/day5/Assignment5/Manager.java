package com.day5.Assignment5;

public class Manager extends Employee{
	
	double experienceInYears;
	double salary;


	public Manager(String empName, double experienceInYears, double salary) {
		super(empName);
		this.experienceInYears = experienceInYears;
		this.salary = salary;
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
		
	}

}
