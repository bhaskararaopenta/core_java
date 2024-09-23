package com.day5.runTimePolymorphism;

public class Second extends First {

	String addrs;

	String msg = "helloword";

	double pi = 3.142;

	public Second() {

		// super()

		System.out.println("Default constructor in parent Class");

	}

	public void methodTwo() {

		System.out.println("we are in methodTwo of child class Second");

		System.out.println(this.addrs);

	}

	@Override

	public String sayHello(String s) {

		return "Hi " + s;

	}

	public void display() {

		System.out.println("we are in display method");

		System.out.println(super.sayHello("martin"));

		System.out.println(super.msg);

	}

	public static void main(String[] args) {

		Second sobj = new Second();

		sobj.fname = "sumit";

		sobj.lname = "deshpande";

		sobj.addrs = "mumbai";

		sobj.methodOne();

		sobj.methodTwo();

		String s1 = sobj.sayHello("smith");

		System.out.println(s1);

		sobj.display();

		System.out.println("variables value is : " + sobj.msg);

		System.out.println("pi values is : " + sobj.pi);

		/*
		 * 
		 * A super Class referenceVaribale Holding its sub class object;
		 * 
		 */

		// ParentClass refereceVaribale = new Child()

		System.out.println("//2ndWay");

		First fobj = new Second();

		String s2 = fobj.sayHello("martin");

		System.out.println(s2);

		// fobj.display(); it will get the error

		System.out.println(fobj.msg);// helloworld

		// System.out.println(fobj.pi);

	}

}
