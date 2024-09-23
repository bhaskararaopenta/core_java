package co.day10.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(10);
		ts.add(40);
		// ts.add(null);
		ts.add(30);
		ts.add(30);
		ts.add(25);
		ts.add(20);
		ts.add(15);
		System.out.println("No of elements in treeSet: " + ts.size());
		System.out.println("Natural Sorting order : ");
		System.out.println(ts);// 10,20,25,30
		System.out.println("Element is found or not : ?" + ts.contains(40));
		System.out.println("Element is found or not : ?" + ts.contains(20));
		ts.remove(20);
		System.out.println("after remove : " + ts);
		Integer iob = ts.first();
		System.out.println("First element is : " + iob);
		System.out.println("Last element is : " + ts.last());
		System.out.println("Before poll : " + ts);
		Integer pf = ts.pollFirst();// removed element will be return
		System.out.println("After remove : at : " + pf);
		System.out.println("After poll :" + ts);
		System.out.println("Before poll : " + ts);
		Integer pl = ts.pollLast();// removed element will be return
		System.out.println("After remove : at : " + pl);
		System.out.println("After poll :" + ts);
		// adding the elements
		ts.add(140);
		ts.add(60);
		ts.add(13); // adding elements in ascending order
		System.out.println("elements are : " + ts);
		System.out.println("Displaying the elements using iterator: ");
		Iterator<Integer> iobj = ts.iterator();
		while (iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		System.out.println("Displaying the elements using enchaned for loop ");
		for (Integer i : ts) {
			System.out.println(i);
		}

		System.out.println("Displaying the elements using Descendingiterator: ");
		Iterator<Integer> iobj2 = ts.descendingIterator();
		while (iobj2.hasNext()) {
			System.out.println(iobj2.next());
		}
	}

}
