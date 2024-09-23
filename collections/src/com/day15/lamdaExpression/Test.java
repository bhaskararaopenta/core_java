package com.day15.lamdaExpression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyApp myobj = (a, b, c) -> a + b + c;

		int res = myobj.addition(20, 20, 60);
		System.out.println("the addition is :" + res);
	}

}