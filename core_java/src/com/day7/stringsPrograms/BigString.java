package com.day7.stringsPrograms;

public class BigString {

	public static void main(String[] args) {
		String s="This is a class";
		String res1="";
		String[] ch = s.split(" ");
		for (int i = 0; i < ch.length; i++) {
			res1=ch[i]+" "+res1;
		}
		
		System.out.println(res1);
	}
}
