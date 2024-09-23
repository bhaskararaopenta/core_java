package com.day5.test2OnInterface;

public class MainClass {

	public static void main(String[] args) {

		Circle c = new Circle(6);
		System.out.println("the area of circle is "+c.getArea());
		
		Rectangle r=new Rectangle(3, 5);
		System.out.println("the area of rectangle is "+r.getArea());
		
		Triangle t=new Triangle(3, 5);
		System.out.println("the area of triangle is "+t.getArea());
	}
}
