package com.day5.example3OnInterface;

public class MainClass extends MyClass implements MyInt4 {

	@Override
	public void m2() {
		System.out.println("we are in m2 method");

	}

	@Override
	public String sayHello(String m) {

		return "hi" + m;
	}
	
	public static void main(String[] args) {
		MainClass mc=new MainClass();
		System.out.println(mc.addition(10, 20));
		mc.m1();
		mc.m2();
		System.out.println(mc.sayHello("bhaskar"));
	}

}
