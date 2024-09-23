package com.day4.polymorphism;

public class ExampleOnMethodOverLoading {

	public void addition(int x, int y) {
		int sum = x + y;
		System.out.println("sum of the two number :" + sum);
	}

	public int addition(int x,int y , int z) {
		return x+y+z;
	}
	
	public double addition(double x, double y) {
		System.out.println("we are in two parameters of double");
		return x+y;
	}
	
	public float addition(float x, float y) {
		System.out.println("we are in two parameters of float");
		return x+y;

	}
	public static void main(String[] args) {
		ExampleOnMethodOverLoading eom=new ExampleOnMethodOverLoading();
		eom.addition(10, 20);
		double res=eom.addition(10.0, 20.0);
		System.out.println("sum of the double values is :"+ res);
		
		float res1=eom.addition(10.0f, 40.0f);
		System.out.println("sum of the float values :"+ res1);
	}

}
