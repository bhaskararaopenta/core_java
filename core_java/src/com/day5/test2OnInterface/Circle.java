package com.day5.test2OnInterface;

public class Circle implements Shape {

	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	public double getArea() {

		return Math.PI * (r*r);
	}

}
