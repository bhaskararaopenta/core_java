package com.day5.interfaceTopic;

public class MyAppImpl implements MyApp {

	@Override

	public String sayHello(String s) {

		return "hello " + s;

	}

	@Override

	public void m1() {

		System.out.println("we are in methodOne");

	}

	@Override

	public int addition(int x, int y) {

		// TODO Auto-generated method stub

		return x + y;

	}

	public static void main(String[] args) {

		// firstWay

		MyAppImpl myobj = new MyAppImpl();

		myobj.m1();

		String res = myobj.sayHello("martin");

		System.out.println(res);

		System.out.println("sum of two numbers : " + myobj.addition(30, 40));

		System.out.println("Recommended Way");

		// 2ndway

		// Interface referenceVariable = new holding its implementation class object

		MyApp mobj = new MyAppImpl();

		mobj.m1();

		String st = mobj.sayHello("sayeed");

		System.out.println(st);

		System.out.println("sum of two numbers :" + mobj.addition(40, 50));

		System.out.println("Calling variable from interface");

		System.out.println(MyApp.pi);

	}

}
