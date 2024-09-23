package com.day7.stringsPrograms;

public class FirstHalfRevereseRemainingSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefgh";
		String fR="";
		String ls="";
		
		for (int i = 0; i < s.length(); i++) {
			if(i<s.length()/2) {
				fR=s.charAt(i)+fR;
			}else {
				ls=ls+s.charAt(i);
			}
		}
		System.out.println(fR+ls);

	}

}
