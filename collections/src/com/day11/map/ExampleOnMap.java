package com.day11.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMap {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<>();

		mp.put(1211, "raju");

		mp.put(2121, null);

		mp.put(32121, "shekar");

		mp.put(3221, "allen");

		// mp.put(2121,"ramani");//duplicate ->it overwrites existing one rani ->ramani

		System.out.println(mp);

		mp.putIfAbsent(2121, "ramani");// if key present and value is null then using putIfAbsent

		System.out.println("No of pair in entrySet : " + mp.size());

		System.out.println(mp);

	}

}
