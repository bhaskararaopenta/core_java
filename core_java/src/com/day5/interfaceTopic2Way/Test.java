package com.day5.interfaceTopic2Way;

public class Test extends MyTestImpl{
	 
	@Override
	public int addition(int x, int y) {
		return x+y;
	}
 
     public static void main(String[] args) {
		Test t = new Test();
	   int res = t.addition(30, 50);
	   System.out.println("sum of two numbers is : "+res);
	   t.m2();
	   System.out.println(t.sayHello("martin"));

	}

}
