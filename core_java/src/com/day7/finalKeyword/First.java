package com.day7.finalKeyword;

public class First {

	int studentId;

	String studentName;

	final String collegeCode="CG"; //final instance variable

	static final double pi=3.142;  //static final variable

	public final void methodOne() {//final instance method

		System.out.println("we are in final method methodOne");

	}

	public String sayHello(String s) { //instance method

		return "Hello "+s;

	}

	/*

	 * public static void main(String[] args) { First fobj = new First();

	 * System.out.println("CollegeCode : "+fobj.collegeCode); //final variable value

	 * is constant //try to change the final variable value

	 * //fobj.collegeCode="CGBG"; we cannot reassigned the value

	 * 

	 * System.out.println(First.pi); fobj.methodOne();

	 * 

	 * 

	 * 

	 * }

	 */
 
}
 