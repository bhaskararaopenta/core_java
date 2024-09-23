package com.day6.AssignmentOnException;

public class Tester {

	public static void main(String[] args) throws InfyBankException {

		Validate v = new Validate("bhaskar", "dfgh", 0);
		v.valid(v);
		v.isValidApplicantName(v.getApplicantName());
		v.isValidAge(v.getApplicantAge());
		v.isValidPost(v.getPostApplied());
//		try {
//			v.valid(v);
//		} catch (InfyBankException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		try {
//			v.isValidApplicantName(v.getApplicantName());
//		} catch (InfyBankException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		try {
//			v.isValidPost(v.getPostApplied());
//		} catch (InfyBankException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		
//		try {
//			v.isValidAge(v.getApplicantAge());
//		} catch (InfyBankException e) {
//			System.err.println(e.getMessage());
//		}
	}
}
