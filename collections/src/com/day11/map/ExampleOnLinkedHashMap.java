package com.day11.map;

import java.util.Collection;

import java.util.Iterator;

import java.util.LinkedHashMap;

import java.util.Map.Entry;

import java.util.Set;

public class ExampleOnLinkedHashMap {

	public static void main(String[] args) {

		// to store Integer as keys and values as String i.e, empId,ename

		// <k,v>

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		// Map<Integer,String> lhm = new LinkedHashMap<>();//2nd way of creating object

		// adding Pair into LinkedHashMap

		lhm.put(3121, "smith");

		lhm.put(3211, "allen");// overwrites

		lhm.put(2121, "martin");

		lhm.put(1211, "sita");

		lhm.put(1111, "raja");

		lhm.put(1231, "elin");

		lhm.put(2131, "martin"); // duplicate value

		lhm.put(3211, "scott"); // duplicate key -> its overwrites the existing values.

		System.out.println("No of pairs added in HashMap : " + lhm.size());// 7

		System.out.println("pairs are in insertion order based on key: ");

		System.out.println(lhm);// insertion order preserved based on key

		System.out.println("Search based on key");

		boolean b = lhm.containsKey(1111);

		System.out.println("Key is found or not? : " + b);

		System.out.println("Search based on value");

		boolean b1 = lhm.containsValue("allen");

		System.out.println("Value is found or not? : " + b1);

		// get the value based On Key here Key is Integer values is String

		// String get(Integer)

		String s = lhm.get(1111); // it will return the value

		// if key not exist it will return null

		System.out.println("Values searched based on key : " + s);// raja

		// remove //remove an pair based on key

		String remVal = lhm.remove(1231); // it will return the value and pair will be remove

		System.out.println("After remove : ");

		System.out.println(lhm);

		// remove an pair using Key,value

		boolean revmKV = lhm.remove(2121, "martin"); // it search exact key and value exist it will remove and return
														// true

		System.out.println("Pair is removed or not? : " + revmKV);

		System.out.println("After remove : ");

		System.out.println(lhm);// {3121=smith, 2131=martin, 1111=raja, 3211=scott, 1211=sita}

		// replace(key,new value)

		/*
		 * 
		 * hm.replace(2131,"alex"); //replacing martin to alex on key 2131
		 * 
		 * System.out.println("After replace : "); System.out.println(hm);
		 * 
		 */

		// replace(key,oldvalue,newvalue);

		lhm.replace(2131, "martin", "alex"); // replacing martin to alex on key 2131

		System.out.println("After replace : ");

		System.out.println(lhm);

		// from existing pairs you want to get only keys(separate) keySet()

		Set<Integer> sKys = lhm.keySet();

		System.out.println("From Pairs(key,value) keys are :");

		for (Integer st : sKys) {

			System.out.println(st);

		}

		// from existing pairs you want to get only values(separate) ->values()

		Collection<String> cValues = lhm.values();

		System.out.println("From Pairs(key,value) separating values are :");

		for (String vSt : cValues) {

			System.out.println(vSt);

		}

		System.out.println("Displaying pair by pair using iterator");

		// Set<Entry<Integer,Value>> entrySet();

		Set<Entry<Integer, String>> entry = lhm.entrySet();

		Iterator<Entry<Integer, String>> iobj = entry.iterator();

		while (iobj.hasNext()) {

			Entry<Integer, String> em = iobj.next();

			// System.out.println(em);

			System.out.println(em.getKey() + "  " + em.getValue());

		}

		System.out.println("Displaying pair by pair using enhanced for loop");

		for (Entry<Integer, String> ept : lhm.entrySet()) {

			System.out.println(ept.getKey() + " " + ept.getValue());

		}

	}

}
