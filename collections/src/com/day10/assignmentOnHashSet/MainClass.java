package com.day10.assignmentOnHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		HashSet<Product> lhs = new HashSet<Product>();
		Product p = new Product(1234, "fridge", 30000);
		Product p1 = new Product(1243, "car", 80000);
		Product p2 = new Product(1322, "mobile", 25000);
		Product p3 = new Product(1234, "fridge", 30000);

		lhs.add(p);
		lhs.add(p1);
		lhs.add(p2);
		lhs.add(p3);

		System.out.println("no of objects :" + lhs.size());
		System.out.println("order :");
		System.out.println(lhs);

		System.out.println("printing using iterator");
		Iterator<Product> itr = lhs.iterator();
		while (itr.hasNext()) {
			Product pr = itr.next();
			System.out.println(pr.getProductId() + " " + pr.getProductName() + " " + pr.getPrice());
		}

		System.out.println("printing using for loop");
		for (Product product : lhs) {
			System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getPrice());
		}

		System.out.println("sorting based on price for that we need to convert hashset to arraylist");
		ArrayList<Product> al = new ArrayList<Product>(lhs);
		Collections.sort(al, new MyComparator());

		System.out.println("after salary sorting printing using for loop in ascending order");
		for (Product product : al) {
			System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getPrice());
		}

		System.out.println("after name sorting printing using for loop in ascending order");
		Collections.sort(al, new MyComparatorForNameSort());

		for (Product product : al) {
			System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getPrice());
		}
	}

}
