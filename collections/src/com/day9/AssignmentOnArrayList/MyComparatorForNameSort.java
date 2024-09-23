package com.day9.AssignmentOnArrayList;

import java.util.Comparator;

public class MyComparatorForNameSort implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String s1 = o1.getProductName();
		String s2 = o2.getProductName();

		return s1.compareTo(s2);
	}

}

