package com.day8.accessModifiers1;

public class ExampleOnModifiers {

	private int id = 1021;

	String name = "smith"; // default

	protected double sal = 4000;

	public String companyCode = "CG";

	void m1() {

		System.out.println("we are in m1 method of default access modifier");

	}

	private void m2() {

		System.out.println("we are in m2 method of private access modifier");

	}

	protected void m3() {

		System.out.println("we are in m3 method of protected access modifier");

	}

	public void m4() {

		System.out.println("we are in m4 method of public access modifier");

	}

	/*
	 * 
	 * public static void main(String[] args) { ExampleOnModifiers eom = new
	 * 
	 * ExampleOnModifiers();
	 * 
	 * System.out.println(eom.id+" "+eom.name+" "+eom.sal+" "+eom.companyCode);
	 * 
	 * eom.m1(); eom.m2(); eom.m3(); eom.m4();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

}
