package com.day5;

public class Second extends First{
	 
	 String addrs;

	public Second() {

		super(); //First()

		// TODO Auto-generated constructor stub

	}

	public Second(String addrs) {

		super("sumit","deshpande");//First(String,String)

		this.addrs = addrs;

	}

	public void methodTwo() {

		System.out.println("we are in methodTwo of child class Second");

	    System.out.println(this.addrs);

	}

	public static void main(String[] args) {

	   Second sobj =new Second("Mumbai");

	   sobj.methodOne();

	   sobj.methodTwo();


	}

}

