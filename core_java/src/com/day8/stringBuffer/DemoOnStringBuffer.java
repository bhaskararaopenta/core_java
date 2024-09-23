package com.day8.stringBuffer;

public class DemoOnStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb);
		System.out.println("initial capacity :" + sb.capacity());

		StringBuffer sb1 = new StringBuffer("raju");
		System.out.println("before change :" + sb1.hashCode());
		System.out.println(sb1);

		sb1.append(" rani");
		System.out.println("after changing :" + sb1.hashCode());
		System.out.println(sb1);
		System.out.println("initial capacity :" + sb1.capacity());

		StringBuffer sb2 = new StringBuffer(" World");
		System.out.println("before insert :" + sb2);
		sb2.insert(0, "Hello");
		System.out.println("after insert at index position : " + sb2);

		// replace the characters or string using index position
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println("before replace :" + sb3);
		sb3.replace(1, 3, "java");
		System.out.println("after replace :" + sb3);

		// delete the characters based on index range
		StringBuffer sb4 = new StringBuffer("HelloWorld");
		System.out.println("before delete :" + sb4);
		sb4.delete(2, 6);
		System.out.println("after delete :" + sb4);

		System.out.println("reverse order :" + sb4.reverse());
		
		
		StringBuffer b1 = new StringBuffer("HelloWorld");
		StringBuffer b2 = new StringBuffer("HelloWorld");
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //false -> it will check the hashcode not the content
		
		
		// converting stringBuffer to string & string to stringBuffer
		
		String s="welcome";
		StringBuffer sbf=new StringBuffer(s);
		System.out.println(sbf);
		
		StringBuffer sbf1=new StringBuffer("Hello Bhaskar");
		String st=new String(sbf1);
		System.out.println(st);

	}
}
