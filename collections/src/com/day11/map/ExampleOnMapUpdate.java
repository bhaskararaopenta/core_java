package com.day11.map;

import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Scanner;

public class ExampleOnMapUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Integer, String> mp = new HashMap<>();

		mp.put(1211, "raju");

		mp.put(2121, null);

		mp.put(32121, "shekar");

		mp.put(3221, "allen");

		System.out.println("No of pair in entrySet : " + mp.size());

		System.out.println(mp);

		System.out.println("Enter the key to update the value");

		int keyToUpdate = sc.nextInt();

		for (Entry<Integer, String> etr1 : mp.entrySet()) {

			if (etr1.getKey() == keyToUpdate) {

				System.out.println("Enter the new value :");

				String newValue = sc.next();

				etr1.setValue(newValue);

			}

		}

		System.out.println("After update:");

		for (Entry<Integer, String> etr1 : mp.entrySet()) {

			System.out.println(etr1.getKey() + " " + etr1.getValue());

		}

	}

}
