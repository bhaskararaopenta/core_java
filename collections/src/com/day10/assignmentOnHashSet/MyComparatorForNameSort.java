package com.day10.assignmentOnHashSet;

import java.util.Comparator;

public class MyComparatorForNameSort implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String name1 = o1.getProductName();
		String name2 = o2.getProductName();
		return name1.compareTo(name2);
	}

}
