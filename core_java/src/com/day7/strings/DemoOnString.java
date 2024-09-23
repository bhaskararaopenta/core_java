package com.day7.strings;

public class DemoOnString {

	public static void main(String[] args) {

		String s1 = new String("hello"); // it will allocate memory on Heap

		String s2 = new String("hi");

		String s6 = new String("hello");

		// String literal

		String s3 = "hello"; //// it will allocate memory on String Constant Pool

		String s4 = "hi";

		String s5 = "hello";

		// == operator will compares the hashCode(address) but not the content

		// equals() will compares the content but not the hashCode(address) .

		System.out.println(s1 == s2);// false

		System.out.println(s1 == s3);// false

		System.out.println(s3 == s5);// true

		System.out.println(s1.equals(s5));// true

		System.out.println(
				"String constant pool -->if two string objects having same content it will allocate  the memory  once");

		System.out.println("hashcode of s3 is : " + s3.hashCode());

		System.out.println("hashcode of s5 is : " + s5.hashCode());

		// immutable

		String s7 = new String("world");

		System.out.println("String from s7 is : " + s7 + " hashCode: " + s7.hashCode());

		s7 = s7.concat(" hello");

		System.out.println("String after concat s7 is : " + s7 + " hashCode: " + s7.hashCode());

	}

}
