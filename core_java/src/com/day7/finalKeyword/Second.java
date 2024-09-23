package com.day7.finalKeyword;

public class Second extends First{
	 
	@Override
	public String sayHello(String s) {
		return "HI "+s;
	}
	/*     FINAL METHOD CANNOT BE OVERRIDEN INTO CHILD CLASS
	 * @Override public void methodOne() {
	 * System.out.println("from parent class overriden"); }
	 */
}
