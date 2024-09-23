package com.day9.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStringObjectsInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("papaya");
		al.add("kiwi");
		al.add("grapes");
		al.add("orange");
		al.add("papaya");
		
		System.out.println(" length of arraylist " +al.size());
		System.out.println(al);
		
		System.out.println("ascending order");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("desending order");
		Comparator<Object> c = Collections.reverseOrder();
		Collections.sort(al, c);
		System.out.println(al);
	}

}
