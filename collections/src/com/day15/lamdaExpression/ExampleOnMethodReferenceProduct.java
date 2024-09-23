package com.day15.lamdaExpression;

public class ExampleOnMethodReferenceProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdTest ptobj = Calculation::getSum;

		int res = ptobj.addition(40, 50);
		System.out.println("sum of two numbers is :" + res);
	}

}
