package com.day3;

public class ExampleOnConstructors {

	int empId;
	String empName;
	double empSal;

	static String companyName = "CG";

	public ExampleOnConstructors() { // default constructor
		System.out.println("we are in default constructor");
	}

	//parameterized constructor
	public ExampleOnConstructors(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void display() {
		System.out.println("emplyoee details are :");
		System.out.println(this.empId+" "+this.empName+" "+this.empSal);
	}
	public static void main(String[] args) {
		ExampleOnConstructors eoc=new ExampleOnConstructors();
		eoc.display();
		
		ExampleOnConstructors eoc1=new ExampleOnConstructors(123,"bhaskar",2000);
		eoc1.display();
		
		System.out.println(ExampleOnConstructors.companyName);
		
		System.out.println(eoc1.toString());
	}

}
