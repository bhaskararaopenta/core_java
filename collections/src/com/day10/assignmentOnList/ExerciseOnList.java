package com.day10.assignmentOnList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExerciseOnList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(120);
		al.add(15);
		al.add(25);
		al.add(10);
		
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		
		while (itr.hasNext()) {
			Integer num = itr.next();	
			if (num == 120) {
				itr.remove();
				System.out.println("this number is deleted : "+num);
			}
			
		}
		
		System.out.println(al);
		
	}

}
