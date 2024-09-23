package com.day10.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHasSetUsingString {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("smith");
		hs.add("siva");
		hs.add("Bhaskar");
		hs.add("hari");
		hs.add("hemanth");
		hs.add("siva");
		hs.add("jyothi");
		hs.add("basha");
		hs.add("sravan");

		System.out.println("no of elements :" + hs.size());
		System.out.println("random order : ");
		System.out.println(hs);

		System.out.println("search an element : using contains ");
		boolean b = hs.contains("siva");
		System.out.println("element is found or not ? : " + b);

		System.out.println("before remove :" + hs);
		boolean b1 = hs.remove(null);
		System.out.println("element is removed or not ? :" + b1);
		System.out.println("after remove :" + hs);

		// hs.set(), hs.replace() --> LinkedHasSet

		System.out.println();

		System.out.println("displayed the elements using iterator ");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("using enhanced for loop");
		for (Object o : hs) {
			System.out.println(o);
		}
		
		ArrayList<String> al=new ArrayList<String>(hs);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("printing in reverse order now");
		
		Comparator<Object> ro = Collections.reverseOrder();
		Collections.sort(al, ro);
		System.out.println(al);
		
		
		System.out.println("now we doing converting arraylist to back to hashset");
		HashSet<String> hs1=new HashSet<String>(al);
		System.out.println(hs1);
	}

}
