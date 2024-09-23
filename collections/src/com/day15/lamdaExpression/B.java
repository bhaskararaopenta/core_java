package com.day15.lamdaExpression;

public class B implements XYZ {

	@Override
	public void m1() {
		System.out.println("We are in methodOne of B class");
	}

	@Override
	public void m2() {
		System.out.println("We are in methodTwo of B class");
	}

	// this class not required to use the default logic,instead these can override
	// the
	// default method and write his own logic
	@Override
	public void display() {
		System.out.println("we are in display method of  B class");
	}

}
