package com.day5.example1OnInterface;

public class ExampleOnUseCase1 implements I2{
	 
	@Override

	public String sayHello(String s) {

		return "Hello "+s;

	}
 
	@Override

	public int addition(int x, int y, int z) {

		return x+y+z;

	}
 
	@Override

	public void display() {

		System.out.println("we are in display method");

	}

	public static void main(String[] args) {

		ExampleOnUseCase1 eous1 = new ExampleOnUseCase1();

		System.out.println(eous1.sayHello("fazil"));

		System.out.println(eous1.addition(30, 20, 10));

		eous1.display();

	}
 
}

 