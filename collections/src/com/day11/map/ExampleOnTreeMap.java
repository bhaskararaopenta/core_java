package com.day11.map;

import java.util.TreeMap;

public class ExampleOnTreeMap {

	public static void main(String[] args) {

		// to store Integer as keys and values as String i.e, empId,ename

		// <k,v>

		TreeMap<Integer, String> tm = new TreeMap<>();

		// Map<Integer,String> tm = new TreeMap<>();//2nd way of creating object

		// adding Pair into TreeMap

		tm.put(301, "mango");

		tm.put(201, "kiwi");

		tm.put(212, "orange");

		tm.put(10, "dragon");

		tm.put(30, "papaya");

		tm.put(15, "banana");

		tm.put(50, null); // null values allowed

		// tm.put(null,"apple"); null key is not allowed

		System.out.println("No of pairs : " + tm.size());

		System.out.println("Natural Sorting order(ascending order) :");

		System.out.println(tm);// {10=dragon,15=banana,30=papaya,201=kiwi,212=orange,301=,mango}

	}

}
