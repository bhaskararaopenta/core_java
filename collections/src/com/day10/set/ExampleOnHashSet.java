package com.day10.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();

		hs.add("smith");
		hs.add(10);
		hs.add(20.00f);
		hs.add('c');
		hs.add(10.0);
		hs.add(300l);
		hs.add(10);
		hs.add(null);
		hs.add(true);

		System.out.println("no of elements :" + hs.size());
		System.out.println("random order : ");
		System.out.println(hs);

		System.out.println("search an element : using contains ");
		boolean b = hs.contains(10);
		System.out.println("element is found or not ? : " + b);

		System.out.println("before remove :" + hs);
		boolean b1 = hs.remove(null);
		System.out.println("element is removed or not ? :" + b1);
		System.out.println("after remove :" + hs);

		// hs.set(), hs.replace() --> LinkedHasSet

		System.out.println();

		System.out.println("displayed the elements using iterator ");
		Iterator<Object> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using enhanced for loop");
		for(Object o:hs) {
			System.out.println(o);
		}
	}

}
