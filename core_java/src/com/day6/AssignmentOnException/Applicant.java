package com.day6.AssignmentOnException;

public class Applicant {

	private String applicantName;
	private String postApplied;
	private Integer applicantAge;

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPostApplied() {
		return postApplied;
	}

	public void setPostApplied(String postApplied) {
		this.postApplied = postApplied;
	}

	public Integer getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(Integer applicantAge) {
		this.applicantAge = applicantAge;
	}

	public Applicant(String applicantName, String postApplied, Integer applicantAge) {
		super();
		this.applicantName = applicantName;
		this.postApplied = postApplied;
		this.applicantAge = applicantAge;
	}


	

}
