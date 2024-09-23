package com.day6.AssignmentOnException;

public class Validate extends Applicant{

	public Validate(String applicantName, String postApplied, Integer applicantAge) {
		super(applicantName, postApplied, applicantAge);
		// TODO Auto-generated constructor stub
	}

	public void valid(Applicant applicant) throws InfyBankException {
		if (applicant.getApplicantName().isEmpty() || applicant.getApplicantAge() == null
				|| applicant.getPostApplied().isEmpty()) {
			throw new InfyBankException("field should not empty");
		}else {
			System.out.println(applicant.getApplicantName()+" "+ applicant.getPostApplied()+" "+applicant.getApplicantAge());
		}

	}

	public boolean isValidApplicantName(String name) throws InfyBankException {
		if (name.isEmpty()) {
			throw new InfyBankException("name should not empty");
		}
		return false;

	}

	public boolean isValidPost(String post) throws InfyBankException {

		if (post != "Probationary Officer" || post != "Assistant" || post != "Special Cadre Officer") {
			throw new InfyBankException("pls choose correct job for apply");
		}
		return false;

	}

	public boolean isValidAge(int age) throws InfyBankException {

		if (age < 18) {
			throw new InfyBankException("age is not applicable for the post");
		}
		return false;

	}
}
