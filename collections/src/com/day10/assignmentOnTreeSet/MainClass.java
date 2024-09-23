package com.day10.assignmentOnTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		CustomComparatorForSal cc = new CustomComparatorForSal();
		TreeSet<Employee> ts = new TreeSet<Employee>(cc);
		Employee emp = new Employee(1234, "bhaskar", 1234);
		Employee emp1 = new Employee(345, "Sai", 2000);
		Employee emp2 = new Employee(9876, "shiva", 2500);
		Employee emp3 = new Employee(3456, "jyothi", 34);
		Employee emp4 = new Employee(1234, "bhaskar", 1234);

		ts.add(emp);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		System.out.println("nio of objects :" + ts.size());
		System.out.println(ts);

		Iterator<Employee> itr = ts.iterator();
		while (itr.hasNext()) {
			Employee pr = itr.next();
			System.out.println(pr.getEmpid()+" "+pr.getEmpName()+" "+ pr.getEmpSal());

		}

	}
}
