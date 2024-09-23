package com.day3;

// this program is refering the Object is initalizing from default constructor ->
//to the parameterized Constructor
public class Customer {
	int custId;
	String custName;
	String addrs;

	public Customer() {
		this(1234, "bhaskar", "hdg");
		System.out.println("we are in default constuctor");
	}

	public Customer(int custId, String custName, String addrs) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addrs = addrs;
	}

	public void m1() {
		System.out.println("we are in m1 method");

	}

	public void display() {
		System.out.println("customer details are :");
		System.out.println(this.custId + " " + this.custName + " " + this.addrs);
		this.m1();

	}

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.display();
	}

}
