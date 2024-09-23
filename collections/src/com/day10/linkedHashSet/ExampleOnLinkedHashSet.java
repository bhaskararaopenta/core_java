package com.day10.linkedHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleOnLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		lhs.add(30);
		lhs.add(10);
		lhs.add(20);
		lhs.add(10);
		lhs.add(40);
		lhs.add(300);
		lhs.add(10);
		lhs.add(90);
		lhs.add(50);

		System.out.println("size of linkedhashset :" + lhs.size());
		System.out.println("insertion order is preserved ");
		System.out.println(lhs);

		System.out.println("search an element : using contains ");
		boolean b = lhs.contains(10);
		System.out.println("element is found or not ? : " + b);

		System.out.println("before removing :" + lhs);
		System.out.println("removing 30 element :" + lhs.remove(30));
		System.out.println("after removing :" + lhs);

		ArrayList<Integer> al = new ArrayList<Integer>(lhs);
		System.out.println("sorting ");
		Collections.sort(al);
		System.out.println(al);

		System.out.println("printing using iterator");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("printitng using for llop");
		for (Integer it : al) {
			System.out.println(it);
		}
		
		System.out.println("converting arraylist to linkedhashset");
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>(al);
		System.out.println(lhs1);
	}

}
