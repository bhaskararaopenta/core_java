package com.day7.stringsPrograms;

public class BasedOnEvenIndexFirstAndRemainingLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefgh";
		String f="";
		String ls="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				f=f+s.charAt(i);
			} else {
				ls=ls+s.charAt(i);
			}
		}
		System.out.println(f+ls);

	}

}
