package com.day3;

// this program is refereing the accessing instance variables in static method
public class Student {
	int studentId;
	String studentName;
	String batchCode;

	public Student() {

	}

	public Student(int studentId, String studentName, String batchCode) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.batchCode = batchCode;
	}

	public static void display(Student s) {
		System.out.println("Student Details are:");
		System.out.println(s.studentId + " " + s.studentName + " " + s.batchCode);
	}

	public static void main(String[] args) {
		Student st = new Student(123, "hj", "dfghj");
		st.display(st);
	}

}
