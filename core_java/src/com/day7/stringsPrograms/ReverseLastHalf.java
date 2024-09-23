package com.day7.stringsPrograms;

public class ReverseLastHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefgh";
		String f="";
		String l="";
		
		for (int i = 0; i < s.length(); i++) {
			if (i<s.length()/2) {
				f=f+s.charAt(i);
			} else {
				l=s.charAt(i)+l;
			}
		}
		System.out.println(f+l);
	}

}
