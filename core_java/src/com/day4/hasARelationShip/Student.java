package com.day4.hasARelationShip;

public class Student {
	int sId;
	String sName;
	String batchCode;
	Course cObj;

	public Student(int sId, String sName, String batchCode, Course cObj) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.batchCode = batchCode;
		this.cObj = cObj;
	}

}
