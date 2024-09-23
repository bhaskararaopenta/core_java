package com.day4.polymorphism;

public class ExampleOnMethodOverLoading2 {

	public void addition(int x, int y) {
		System.out.println("int type parameters");
		System.out.println("sum of two numbers is :" + (x + y));

	}

	public double addition(double x, double y) {
		System.out.println("double type parameters");
		return x + y;
	}

	public static void main(String[] args) {
		ExampleOnMethodOverLoading2 eom2 = new ExampleOnMethodOverLoading2();
		eom2.addition(10, 50); // addition(int,int)
		// method overloading automatic type promotion
		
		eom2.addition('a', 'A'); // addition(char,char) -> addition(int ,int)
		
		double res=eom2.addition(10.0, 20.0);// addition(double,double)
		System.out.println("sum of two numbers :"+ res);
		
		
		// method overloading automatic type promotion
		double res1=eom2.addition(40l, 40l); //addition(long,long) -> addition(float,float)->addition(double,double)
		System.out.println("su of the two numbers of long values :"+ res1);
	}
	

}
