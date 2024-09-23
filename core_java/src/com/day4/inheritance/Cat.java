package com.day4.inheritance;

public class Cat extends Animal {
	
	public void bark() {
		System.out.println("meow  meoww");
	}

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.bark();
		cat.eat();  

	}

}
