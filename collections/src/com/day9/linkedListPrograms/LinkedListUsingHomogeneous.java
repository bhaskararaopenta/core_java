package com.day9.linkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsingHomogeneous {

	public static void main(String[] args) {

		LinkedList<Integer> al = new LinkedList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);

		System.out.println(" no of elements in an LinkedList : " + al.size());

		System.out.println(al);

		// replace elements or insert object at specific index position
		al.set(3, 40);
		System.out.println("Replace at at the specific 3 rd");
		System.out.println(" updated array : " + al);

		// for search element exist or not using boolean Contains(Integer)
		System.out.println("search an element 60 is exist or not ? :" + al.contains(60));

		// for search element exist or not using boolean Contains(Integer)
		System.out.println("search an element 60 is exist or not ? :" + al.contains(10));
		System.out.println(al.get(1)); // display using index

		// for remove an element using integer remove(int index)
		System.out.println("after remove an elment 30 and return an element :" + al.remove(2));
		System.out.println(al);

		// adding an element at specific position using add(int index ,integer value)

		al.add(0, 0);
		System.out.println("after adding element at specific position");
		System.out.println(al);

		// printing using Iterator Object

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		// this is using ListIterator

		System.out.println("printing using ListIterator");
		ListIterator<Integer> itr1 = al.listIterator();
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());

		}

		System.out.println();

		// printing using Enhanced for Loop
		System.out.println("enhanced for loop");
		for (Object object : al) {
			System.out.println(object);
		}

	}

}
