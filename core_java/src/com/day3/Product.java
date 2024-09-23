package com.day3;

// this program is regarding Copy Constructor
public class Product {

	int productId;
	String productName;
	double price;

	public Product(Product p) {// copy constructor
		this.productId = p.productId;
		this.productName = p.productName;
		this.price = p.price;
	}

	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public void display() {
		System.out.println("product details are");
		System.out.println(this.productId + " " + this.productName + " " + this.price);
	}

	public static void main(String[] args) {
		Product pro = new Product(1001, "gdyhb", 20);
		pro.display();
		
		System.out.println("creating the object using copy constructor");
		Product pro1 = new Product(pro);
		pro1.display();
	}

}
