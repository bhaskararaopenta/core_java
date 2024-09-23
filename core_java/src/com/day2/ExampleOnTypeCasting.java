package com.day2;

public class ExampleOnTypeCasting {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("Int variable value is :" + a);

		double d = a;
		System.out.println("after convert int variable value into double :" + d);

		// typeCasting

		int i = 65;
		System.out.println("Int value is :" + i);

		char ch = (char) i;
		System.out.println("after converting int to char is :" + ch);

		String s = "hello"; 
		System.out.println("String is :" + s);

		Object o = s; // Directly convert child class object into parent class object
		System.out.println("after convert string to object class :" + o);

		// typr casting
		Object ob1 = "helloworld"; // parent
		System.out.println("super class variable value is :" + ob1);

		String s2 = (String) ob1; // with help of () operator we can convert parent class object to child
		System.out.println("sub class variable value is :" + s2);

	}

}
