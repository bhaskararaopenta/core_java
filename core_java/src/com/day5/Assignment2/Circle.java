package com.day5.Assignment2;

public class Circle extends Shape {

	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public double calculateArea() {
		return Math.PI * (r * r);

	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * r; // 2pir

	}

}
