package com.day9.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnArrayList {

	public static void main(String[] args) {
		// for heterogenous elements the generic eklement type is Object
		ArrayList<Object> al = new ArrayList<>();
		al.add("Bhaskar"); // String
		al.add(10); // Integer
		al.add(true); // Boolean
		al.add(null); // null values allowed
		al.add(10.00); // Double
		al.add(10); // Integer
		al.add(20.00f); // Float

		System.out.println("no of size of an arraylist " + al.size());
		System.out.println(al);

		// printing using Iterator Object

		Iterator<Object> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		System.out.println();

		// printing using Enhanced for Loop
		System.out.println("enhanced for loop");
		for (Object object : al) {
			System.out.println(object);
		}
	}

}
