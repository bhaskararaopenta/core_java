package com.day9.AssignmentOnArrayList;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		double pc1 = o1.getPrice();
		double pc2 = o2.getPrice();

		if (pc1 < pc2) {
			return 1;
		} else if (pc1 > pc2) {
			return -1;
		} else {
			return 0;
		}
	}

}
