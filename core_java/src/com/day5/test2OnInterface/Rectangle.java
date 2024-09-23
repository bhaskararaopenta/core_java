package com.day5.test2OnInterface;

public class Rectangle implements Shape {

	int l;
	int b;

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;

	}

	public double getArea() {

		return l * b;
	}

}
