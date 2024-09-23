package com.day7.strings;

public class StringMethods {

	public static void main(String[] args) {

		String s = "HelloWorld";

		String s1 = "helloworld";

		String s3 = new String("welcome to java"); // internally string will store in the form of array

		System.out.println(s.equals(s1)); // false

		System.out.println(s.equalsIgnoreCase(s1));// true

		System.out.println("length of the string : " + s3.length());

		System.out.println(s1 + ": converting into upper case " + s1.toUpperCase());

		// Returns the character at ith index.

		System.out.println("Character at 2nd position = " + s3.charAt(2));

		System.out.println("after concat : " + s3.concat(" " + s1));

		// Return the substring from the ith index character to end of string

		System.out.println("Substring from index 3 is :" + s3.substring(3));

		//// Returns the substring from i to j-1 index.

		// substring(startIndex,endIndex); //end index will not included

		System.out.println("Substring from start position at 3 and end position at 4: " + s3.substring(2, 4));// lc

		// Returns the index within the string

		// of the first occurrence of the specified string using indexOf.

		String s4 = "Hello World World Hi World";

		System.out.println("First occurance of the word at specific position:");

		System.out.println(s4.indexOf("World"));// 6

		System.out.println("Last occurance of the word at specific position:");

		System.out.println(s4.lastIndexOf("World"));// 21

		// replace

		String s5 = "Hello world World";

		System.out.println("after repalce : " + s5.replace('w', 'H')); // Hello Horld World

		System.out.println("After replace : " + s5.replace("lo", "hi")); // Helhi world World

		String s6 = " welcome to java ";

		System.out.println("After remove space from both end :" + s6.trim());

		System.out.println("After remove space from both end :" + s6.strip());//

		String s7 = "   welcome to java";

		System.out.println("s7 string is :" + s7);

		System.out.println("After remove leading space:" + s7.stripLeading());

		String s8 = "welcome to java";

		System.out.println(s8.contains("java")); // search word in given string

		System.out.println("s8 startwith :" + s8.startsWith("Wel"));// false

		System.out.println("s8 ends with : " + s8.endsWith("va"));// true

		String st = "Bigdata is huge amount of data";

		System.out.println(st);

		// String[] split("",string);

		// coverting string line to string words

		System.out.println("coverting string line to string words");

		String wrd[] = st.split("\\s"); // st.split(" ")

		for (int i = 0; i < wrd.length; i++) {

			System.out.println(wrd[i]);

		}

	}

}
