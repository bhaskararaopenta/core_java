package com.day5.example2OnInterface;

public class ExampleOnUseCase2 implements MyInt1, MyInt2 {

	@Override
	public void m2() {

		System.out.println("we are in method two");

	}

	@Override
	public int addition(int x, int y) {

		return x + y;

	}

	@Override
	public void m1() {

		System.out.println("we are in methodOne");

	}

	@Override
	public String sayHello(String s) {

		return "Hello " + s;

	}

	public static void main(String[] args) {

		ExampleOnUseCase2 eous2 = new ExampleOnUseCase2();

		eous2.m1();

		eous2.m2();

		System.out.println("sum of two numbers : " + eous2.addition(10, 30));

		System.out.println(eous2.sayHello("pritham"));

	}

}
