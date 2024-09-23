package com.day5.interfaceTopic2Way;

public abstract class MyTestImpl implements MyTest{
	 
	@Override
	public void m2() {
		System.out.println("we are in m2 method");
	}
 
	@Override
	public String sayHello(String s) {
		return "Hello "+s;
	}
 
}