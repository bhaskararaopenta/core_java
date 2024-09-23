package com.day7.stringsPrograms;

public class FirstVowelsLastConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefgh";
		String vowels="aeiouAEIOU";
		String v="";
		String c="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (vowels.indexOf(ch)==-1) {
				c=c+ch;
			}else {
				v=v+ch;
			}
		}
		
		System.out.println(v+c);

	}

}
