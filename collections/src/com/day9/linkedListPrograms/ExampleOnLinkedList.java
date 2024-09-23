package com.day9.linkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for heterogenous elements the generic eklement type is Object
		LinkedList<Object> al = new LinkedList<>();
		al.add("Bhaskar"); // String
		al.add(10); // Integer
		al.add(true); // Boolean
		al.add(null); // null values allowed
		al.add(10.00); // Double
		al.add(10); // Integer
		al.add(20.00f); // Float

		System.out.println("no of size of an Linkedlist " + al.size());
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
