package com.day5.Assignment5;

public abstract class Employee {

	String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public abstract double calculateSalary();

	public abstract void displayInfo();
}
