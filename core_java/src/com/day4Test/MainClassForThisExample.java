package com.day4Test;

public class MainClassForThisExample {
	public static void main(String[] args) {
		Address ad = new Address("vizag", "vishakapatnam");
		Employee em = new Employee(111, "Se", 123456, ad);
		em.display();
		em.employeeDetails();

		System.out.println("the Address details are");
		System.out.println(em.address.area);
		System.out.println(em.address.district);
	}

}
