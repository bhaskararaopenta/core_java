package com.day5.Assignment4;

public class MainClass {

	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println(lion.eat());
		System.out.println(lion.sleep());

		Tiger tiger = new Tiger();
		System.out.println(tiger.eat());
		System.out.println(tiger.sleep());
		
		Deer deer = new Deer();
		System.out.println(deer.eat());
		System.out.println(deer.sleep());
	}
}
