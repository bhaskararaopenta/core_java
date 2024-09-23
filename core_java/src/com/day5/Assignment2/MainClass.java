package com.day5.Assignment2;

public class MainClass {

	public static void main(String[] args) {
		Circle c = new Circle(6);
		System.out.println("the area of circle is " + c.calculateArea());
		System.out.println("the perimeter of circle is " + c.calculatePerimeter());

		Triangle t = new Triangle(3, 5, 6);
		System.out.println("the area of Triangle is " + t.calculateArea());
		System.out.println("the perimeter of Triangle is " + t.calculatePerimeter());

	}

}
