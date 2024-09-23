package com.day4Test;

public class Employee extends Person {

	int eId;
	String eRole;
	double salary;
	Address address;

	public Employee(int eId, String eRole, double salary, Address address) {
		super();
		this.eId = eId;
		this.eRole = eRole;
		this.salary = salary;
		this.address = address;
	}

	public void employeeDetails() {
		System.out.println("the emplyoee details are");
		System.out.println(this.eId + " " + this.salary + " " + this.eRole);
	}

}
