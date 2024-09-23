package com.day10.assignmentOnHashSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		double pr1 = o1.getPrice();
		double pr2 = o2.getPrice();

		if (pr1 > pr2) {
			return 1;
		} else if (pr1 < pr2) {
			return -1;
		}
		return 0;
	}

}
