package com.day10.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnIntegerHashSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(40);
		hs.add(300);
		hs.add(10);
		hs.add(90);
		hs.add(10);

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
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using enhanced for loop");
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("sorting now");
		
		// we can convert hashset object into arraylist
		
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("printing in reverse order now");
		
		Comparator<Object> ro = Collections.reverseOrder();
		Collections.sort(al, ro);
		System.out.println(al);
		
		
		System.out.println("now we doing converting arraylist to back to hashset");
		HashSet<Integer> hs1=new HashSet<Integer>(al);
		System.out.println(hs1);
	}

}
