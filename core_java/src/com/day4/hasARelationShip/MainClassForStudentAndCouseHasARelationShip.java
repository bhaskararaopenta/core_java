package com.day4.hasARelationShip;

public class MainClassForStudentAndCouseHasARelationShip {

	public static void main(String[] args) {
		Course c = new Course(123, "fghj", 1234);
		Student s1 = new Student(12, "Bhaskar", "java", c);
		
		
		System.out.println("student details are: ");
		System.out.println(s1.sId);
		System.out.println(s1.sName);
		System.out.println(s1.batchCode);
		
		
		System.out.println("students enrolled");
		System.out.println(s1.cObj.cId);
		System.out.println(s1.cObj.Cname);
		System.out.println(s1.cObj.fees);
	}

}
