package com.day9.linkedListPrograms;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortingStringObjectsInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al = new LinkedList<String>();
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
