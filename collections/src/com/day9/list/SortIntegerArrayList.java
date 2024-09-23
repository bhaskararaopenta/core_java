package com.day9.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortIntegerArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(10);
		al.add(5);
		al.add(4);
		al.add(25);
		al.add(50);
		al.add(15);
		al.add(10);

		System.out.println(" no of elements in an arrayList : " + al.size());
		System.out.println(al);

		// for sort we will static sort() from collections class
		// collections.sort(list) // by default it will sort in ascending order
		// collections.sort(list,comparator obj) // this method for descending order

		Collections.sort(al);
		System.out.println("after sort in ascending order");
		System.out.println(al);

		System.out.println("after sorting in descending order");
		Comparator<Object> c = Collections.reverseOrder();
		Collections.sort(al, c);
		System.out.println(al);

	}

}
