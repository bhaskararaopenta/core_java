package com.day7.assignmentOnInterface;

public class Calculator implements AdvancedAirthmetic {

	@Override
	public int divisorSum(int n) {
		int sum = 0;

		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				sum=sum+i;
			}
		}
		return sum;

	}
	
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.divisorSum(20));
	}

}
