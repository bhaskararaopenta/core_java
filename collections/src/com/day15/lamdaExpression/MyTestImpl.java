package com.day15.lamdaExpression;

public class MyTestImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyTest mt = (m) -> "Hello " + m;
		MyTest mt = (m) -> {
			return "hello " + m;
		};
		String res = mt.sayHello("Basu");
		System.out.println(res);

	}

}
