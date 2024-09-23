package com.day6.Assignment;

public class SecondMin {

	public static void main(String[] args) {
		int a[]= {1,1,9,4,2};
		int min=a[0];
		int secMin=a[1];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				
				min=a[i];
			}
			
		}
		System.out.println(min);
	}
}
