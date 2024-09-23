package com.day8.accessModifiers1;

public class Test {

	public static void main(String[] args) {

		ExampleOnModifiers eom = new ExampleOnModifiers();

		// System.out.println(eom.id);//private

		System.out.println(eom.name);// default

		System.out.println(eom.sal);// protected

		System.out.println(eom.companyCode);// public

		eom.m1();

		// eom.m2();//private

		eom.m3();

		eom.m4();

	}

}
