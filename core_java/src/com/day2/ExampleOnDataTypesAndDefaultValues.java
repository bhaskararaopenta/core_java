package com.day2;

public class ExampleOnDataTypesAndDefaultValues {

	int studentId; // default value is 0
	long marks;		// default value is 0
	float percent;	// default value is 0.0
	double totalMarks;	// default value is 0.0
	boolean result;	// default value is false
	
	//class type
	String s;	// default value is null
	Object obj;	// default value is null
	Chair cobj;	// default value is null
	
	public static void main(String[] args) {
		ExampleOnDataTypesAndDefaultValues eodv=new ExampleOnDataTypesAndDefaultValues();
		System.out.println(eodv.studentId);
		System.out.println(eodv.marks);
		System.out.println(eodv.percent);
		System.out.println(eodv.totalMarks);
		System.out.println(eodv.result);
		
		
		System.out.println(eodv.s);
		System.out.println(eodv.obj);
		System.out.println(eodv.cobj);
	}

}
