package com.day5.runTimePolymorphism;

public class First {

	String fname;

	String lname;

	String msg = "welcome";

	public First() {

		System.out.println("We are in default constructor in parent class");

	}

	public void methodOne() {

		System.out.println("We are in methodOne of parent First Class");

		System.out.println(this.fname + " " + this.lname);

	}

	public String sayHello(String s) {

		return "hello " + s;

	}

}
