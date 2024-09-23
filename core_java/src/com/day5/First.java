package com.day5;

public class First {

	String fname;

	String lname;

	public First() {

		System.out.println("We are in default constructor in parent class");

	}

	public First(String fname,String lname) {

        this.fname=fname;

        this.lname=lname;
 
	}

	public void methodOne() {

		System.out.println("We are in methodOne of parent First Class");

		System.out.println(this.fname+" "+this.lname);

	}

}

 