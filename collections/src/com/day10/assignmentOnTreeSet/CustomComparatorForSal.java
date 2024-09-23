package com.day10.assignmentOnTreeSet;

import java.util.Comparator;

public class CustomComparatorForSal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double sal1 = o1.getEmpSal();
		double sal2 = o2.getEmpSal();

		if (sal1 > sal2) {
			return 1;
		} else if (sal1 < sal2) {
			return -1;
		}
		return 0;
	}

}
