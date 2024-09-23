package com.day7.stringsPrograms;

public class RevereseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello world";
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i) + res;
		}
		System.out.println(res);
	}

}
