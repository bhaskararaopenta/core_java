package com.day8.accessModifiers2;

import com.day8.accessModifiers1.ExampleOnModifiers;

public class TestOnModifiers extends ExampleOnModifiers {

	public static void main(String[] args) {

		TestOnModifiers t1 = new TestOnModifiers();

		// System.out.println(t1.id);//private

		// System.out.println(t1.name);//default

		System.out.println(t1.sal);// protected

		System.out.println(t1.companyCode);// public

		// t1.m1();//default

		// t1.m2();//private

		t1.m3();// protected

		t1.m4();// public

	}

}
