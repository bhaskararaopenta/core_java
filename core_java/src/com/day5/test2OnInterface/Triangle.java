package com.day5.test2OnInterface;

public class Triangle implements Shape {

	double d=0.5;
	int l;
	int b;

	public Triangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public double getArea() {
		return d *( l * b);
	}

}
