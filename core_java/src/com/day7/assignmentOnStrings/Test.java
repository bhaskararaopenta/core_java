package com.day7.assignmentOnStrings;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a=sc.nextLine();
		System.out.println("enter second string");
		String b=sc.nextLine();

		String s1 = a;
		String s2 = b;

		int res = s1.length() + s2.length();
		System.out.println(res);

		int res1 = s1.compareTo(s2);

		if (res1 < 0) {
			System.out.println("No");
		} else {
			System.out.println("yes");
		}
		
		
		String res2=s1.substring(0,1).toUpperCase().concat(s1.substring(1))+" "+s2.substring(0, 1).toUpperCase().concat(s2.substring(1));
		System.out.println(res2);

	}
}
