package com.day4.polymorphism;

public class TestOverride extends ExampleOnOverride1 {

	int a = 20;

	private void m2() {
		String s1 = super.sayHello("bhaskar");
		System.out.println("we are in m2 method of the test class");
		System.out.println("from parent class : " + s1);

		System.out.println("from parent class " + "variable: " + super.a);

	}

	@Override
	public String sayHello(String s) {  
		return "hi " + s;
	}

	public static void main(String[] args) {
		TestOverride to = new TestOverride();
		to.m1();
		to.m2();
		System.out.println(to.sayHello("siva"));
	}

}
