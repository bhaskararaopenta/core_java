package com.day6.testOnException;

public class Details {

	String firstName;
	String lastName;

	public Details(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void DetailsMethod() throws NameException {

		if (this.firstName.isEmpty() || this.lastName.isEmpty()) {
			throw new NameException("fields should not empty");
		} else {
			System.out.println(this.firstName + " " + this.lastName);
		}
		
	}
	
	public static void main(String[] args) {
		Details d=new Details("", "ram");
		try {
			d.DetailsMethod();
		} catch (NameException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
