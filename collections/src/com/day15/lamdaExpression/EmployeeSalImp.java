package com.day15.lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		EmployeeSal empsal = (e) -> e;
		List<Integer> finals = empsal.getEmplyoeeSal(al);
		for (Integer integer : finals) {
			System.out.println(integer);
		}

	}

}