package com.day7.stringsPrograms;

public class IfFirstVowelThenConvertLastLetterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a even number";
		String vowels="aeiouAEIOU";
		String res="";
		String[] ch = s.split("");
		
		for (int i = 0; i < ch.length; i++) {
			if (vowels.indexOf(ch[i].charAt(0))!=-1) {
				res=res+""+ch[i].substring(0,(ch[i].length())-1)+(ch[i].charAt(ch[i].length()-1)+"").toUpperCase();
			}else {
				res=res+""+ch[i];
			}
		}
		System.out.println(res);
	}

}
