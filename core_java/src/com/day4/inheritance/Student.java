package com.day4.inheritance;

public class Student extends Person {

	int sId = 123;
	String batchCode = "CG";

	public void studentDetails() {
		System.out.println("student details are");
		System.out.println(this.sId + " " + this.batchCode);
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.display();
		st.studentDetails();
	}

}
