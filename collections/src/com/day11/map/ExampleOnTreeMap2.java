package com.day11.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExampleOnTreeMap2 {

	public static void main(String[] args) {

		// to store Integer as keys and values as String i.e, empId,ename

		// <k,v>

		TreeMap<Integer, String> tm = new TreeMap<>();

		// Map<Integer,String> tm = new TreeMap<>();//2nd way of creating object

		// adding Pair into TreeMap

		tm.put(3121, "smith");

		tm.put(3211, "allen");// overwrites

		tm.put(2121, "martin");

		tm.put(1211, "sita");

		tm.put(1111, "raja");

		tm.put(1231, "elin");

		tm.put(2131, "martin"); // duplicate value

		tm.put(3211, "scott"); // duplicate key -> its overwrites the existing values.

		System.out.println("No of pairs added in HashMap : " + tm.size());// 7

		System.out.println("pairs are in insertion order based on key: ");

		System.out.println(tm);// insertion order preserved based on key

		System.out.println("Search based on key");

		boolean b = tm.containsKey(1111);

		System.out.println("Key is found or not? : " + b);

		System.out.println("Search based on value");

		boolean b1 = tm.containsValue("allen");

		System.out.println("Value is found or not? : " + b1);

		// get the value based On Key here Key is Integer values is String

		// String get(Integer)

		String s = tm.get(1111); // it will return the value

		// if key not exist it will return null

		System.out.println("Values searched based on key : " + s);// raja

		// remove //remove an pair based on key

		String remVal = tm.remove(1231); // it will return the value and pair will be remove

		System.out.println("After remove : ");

		System.out.println(tm);

		// remove an pair using Key,value

		boolean revmKV = tm.remove(2121, "martin"); // it search exact key and value exist it will remove and return
													// true

		System.out.println("Pair is removed or not? : " + revmKV);

		System.out.println("After remove : ");

		System.out.println(tm);// {3121=smith, 2131=martin, 1111=raja, 3211=scott, 1211=sita}

		// replace(key,new value)

		/*
		 * 
		 * hm.replace(2131,"alex"); //replacing martin to alex on key 2131
		 * 
		 * System.out.println("After replace : "); System.out.println(hm);
		 * 
		 */

		// replace(key,oldvalue,newvalue);

		tm.replace(2131, "martin", "alex"); // replacing martin to alex on key 2131

		System.out.println("After replace : ");

		System.out.println(tm);

		// from existing pairs you want to get only keys(separate) keySet()

		Set<Integer> sKys = tm.keySet();

		System.out.println("From Pairs(key,value) keys are :");

		for (Integer st : sKys) {

			System.out.println(st);

		}

		// from existing pairs you want to get only values(separate) ->values()

		Collection<String> cValues = tm.values();

		System.out.println("From Pairs(key,value) separating values are :");

		for (String vSt : cValues) {

			System.out.println(vSt);

		}

		System.out.println("Displaying pair by pair using iterator");

		// Set<Entry<Integer,Value>> entrySet();

		Set<Entry<Integer, String>> entry = tm.entrySet();

		Iterator<Entry<Integer, String>> iobj = entry.iterator();

		while (iobj.hasNext()) {

			Entry<Integer, String> em = iobj.next();

			// System.out.println(em);

			System.out.println(em.getKey() + "  " + em.getValue());

		}

		System.out.println("Displaying pair by pair using enhanced for loop");

		for (Entry<Integer, String> ept : tm.entrySet()) {

			System.out.println(ept.getKey() + " " + ept.getValue());

		}

		System.out.println("get method :");
		// if key exist it will return value , if key not exist it will return null
		String val = tm.get(3121);
		System.out.println("the value based on key :" + val);

		System.out.println("getOrDefaultvalue");
		// if key exist it will return value ,if key not exist it will return Default
		// value
		// getOrDefault(key,"Default Value");
		String valDf = tm.getOrDefault(1434, "no data");
		System.out.println("the value based on key : " + valDf);
		System.out.println("Descending order keys");
		// Displaying the only key in descending order
		Set<Integer> sortKeyDesc = tm.descendingKeySet();
		for (Integer desc : sortKeyDesc) {
			System.out.println(desc);
		}
		System.out.println("Displaying Keys along with the values in desending order");
		Map<Integer, String> m = tm.descendingMap();
		for (Entry<Integer, String> ept : m.entrySet()) {
			System.out.println(ept.getKey() + " " + ept.getValue());
		}

	}

}
