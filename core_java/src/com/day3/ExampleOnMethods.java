package com.day3;

public class ExampleOnMethods {

	void m1() {
		System.out.println("we are in cg");
	}

	protected int getAddititon(int x, int y) {
		return x + y;

	}

	public String sayHello() {
		return "welcome to java";

	}

	public static String getMsg(String s) {
		return "hi " + s;

	}

	public static void main(String[] args) {

		String result = ExampleOnMethods.getMsg("Bhaskar");
		System.out.println(result);
		System.out.println(ExampleOnMethods.getMsg("Siva"));
		ExampleOnMethods eom = new ExampleOnMethods();
		eom.m1();
		int res = eom.getAddititon(10, 20);
		System.out.println(res);
		System.out.println(eom.getAddititon(20, 30));
		System.out.println(eom.sayHello());

	}

}
