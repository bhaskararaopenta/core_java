package com.day4.inheritance;

public class Emplyoee extends Person {

	int empId = 1234;
	double salary = 2000;

	public void personDetails() {
		System.out.println("the emplyoee details are");
		System.out.println(this.empId + " " + this.salary);
	}

	public static void main(String[] args) {
		Emplyoee emp = new Emplyoee();
		emp.display();
		emp.personDetails();
	}

}
  