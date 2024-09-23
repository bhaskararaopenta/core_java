package com.day9.AssignmentOnArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		Product p = new Product();

		// first way to insert
		p.setProductId(1233);
		p.setProductName("dell");
		p.setPrice(25000);
		al.add(p);

		// second way to insert

		Product p1 = new Product(1244, "hp", 30000);
		al.add(p1);

		// third way to insert

		al.add(new Product(1299, "Asus", 40000));

		System.out.println("size of an arraylist " + al.size());
		System.out.println(al);

		Iterator<Product> iobj = al.iterator();
		System.out.println("printing using Iterator");
		while (iobj.hasNext()) {
			Product pobj = iobj.next();
			System.out.println(pobj.getProductId() + " " + pobj.getProductName() + " " + pobj.getPrice());

		}

		System.out.println("printing using enhanced for loop");
		for (Product pt : al) {
			System.out.println(pt.getProductId() + " " + pt.getProductName() + " " + pt.getPrice());
		}

		Collections.sort(al, new MyComparator());

		System.out.println("sorting for price in ascending order or descending order");
		for (Product pt : al) {
			System.out.println(pt.getProductId() + " " + pt.getProductName() + " " + pt.getPrice());
		}
		System.out.println();
		System.out.println("second max :" + al.get(al.size() - 2));
		System.out.println();

		Collections.sort(al, new MyComparatorForNameSort());

		System.out.println("sorting for name");
		for (Product pt : al) {
			System.out.println(pt.getProductId() + " " + pt.getProductName() + " " + pt.getPrice());
		}

		
	}
}
