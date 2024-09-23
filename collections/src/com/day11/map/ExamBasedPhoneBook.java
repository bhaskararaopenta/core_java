package com.day11.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ExamBasedPhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Long> hs = new HashMap<String, Long>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sample input");
		int count = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			String data = sc.nextLine();
			String[] spData = data.split(":");
			String name = spData[0];
			long number = Long.parseLong(spData[1]);
			hs.put(name, number);
		}

		Set<Entry<String, Long>> entry = hs.entrySet();
		Iterator<Entry<String, Long>> itr = entry.iterator();
		while (itr.hasNext()) {
			Entry<String, Long> res = itr.next();
			System.out.println(res.getKey()+"="+res.getValue());
		}
		
		
	}

}
