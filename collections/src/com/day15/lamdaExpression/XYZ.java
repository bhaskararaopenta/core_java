package com.day15.lamdaExpression;

public interface XYZ {
	public static final int a = 10;

	public void m1();

	public abstract void m2();

	default void display() {// default implementation logic we can override method
		System.out.println("we are in default display");
	}

	// cannot be override in the implementation
	static String sayHello(String s) {
		return "Hello " + s;
	}
}
