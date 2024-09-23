package com.day14.stack;

import java.util.Iterator;
import java.util.Stack;

public class ExampleOnStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(5);
		st.push(30);
		st.push(90);
		st.push(60);
		st.push(50);
		
		System.out.println("no of elements in stack :"+st.size());
		System.out.println(st);
		
		//method peek(); -> it will point out top most element
		Integer topMostElement = st.peek();
		System.out.println("top most element it will return :"+topMostElement);
		
		//copntains()
		boolean b = st.contains(5);
		System.out.println("Element 5 is exist or not ? :"+b);
		
		boolean b1 = st.contains(500);
		System.out.println("element 500 is exist or not ? :"+b1);
		
		//search
		int i = st.search(5);
		System.out.println("Element 5 is exist or not ? :"+i);
		
		int i2 = st.search(500);
		System.out.println("Element 500 is exist or not ? :"+i2);
		
		//remove(int index)//remove(Integer)
		Integer removeTopElement = st.pop();
		System.out.println("top element removed :"+removeTopElement);
		
		System.out.println("after remove :");
		System.out.println(st);
		
		System.out.println("printing using iterator");
		
		Iterator<Integer> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("Enhanced for loop");
		
		for (Integer integer : st) {
			System.out.println(integer);
		}
		
	}
}
