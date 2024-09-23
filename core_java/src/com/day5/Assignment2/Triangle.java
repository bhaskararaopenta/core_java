package com.day5.Assignment2;

public class Triangle extends Shape {

	double d = 0.5;
	int length;
	int breath;
	int side;

	public Triangle(int length, int breath, int side) {
		this.length = length;
		this.breath = breath;
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return d * (length * breath);

	}

	@Override
	public double calculatePerimeter() {
		return length + breath + side;

	}

}
