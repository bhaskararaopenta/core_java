package com.day8.stringPrograms;

public class DemoOnStringMethods {

	public static void main(String[] args) {
		String s="helloworld";
		char[] ch = s.toCharArray();
		
		for(char ct:ch) {
			System.out.println(ct);
		}
		System.out.println("using for loop");
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		int a=10;
		String b=String.valueOf(a);
		System.out.println(b);
		
		char c1='d';
		String st=String.valueOf(c1);
		System.out.println(st);
	}
}
