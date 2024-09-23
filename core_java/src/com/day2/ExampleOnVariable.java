package com.day2;

public class ExampleOnVariable {

	int empId = 1010;
	String empName = "Bhaskar";
	double empSal = 4000;
	int a = 20;

	static String companyName = "CG";

	public void m1() { // instance method
		int a; // local variable
		a = 10;
		System.out.println("local vaiable value is :" + a);
		System.out.println("instance variables value is" + this.a);

	}

	public static void m2() {
		System.out.println("static variable calling" + companyName);
		System.out.println("recommended way is :" + ExampleOnVariable.companyName);
	}

	public static void main(String[] args) {
		ExampleOnVariable eov = new ExampleOnVariable();
		System.out.println(eov.empId);
		System.out.println(eov.empName);
		System.out.println(eov.empSal);

		System.out.println("calling static variables");
		System.out.println(companyName);
		System.out.println(ExampleOnVariable.companyName);

		eov.m1(); // calling instance method
		System.out.println(eov.companyName); // not recommended way

		ExampleOnVariable.m2();// recommended way
		eov.m2();
	}

}
