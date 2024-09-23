package com.day7.stringsPrograms;

public class DoCapitalEvenIndex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefgh";
		String f="";
		
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				f=f+(s.charAt(i)+"").toUpperCase();
			} else {
				f=f+(s.charAt(i)+"").toLowerCase();
			}
			
		}
		System.out.println(f);

	}

}
