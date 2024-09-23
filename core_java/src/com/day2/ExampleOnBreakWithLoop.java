package com.day2;

import java.util.Scanner;

public class ExampleOnBreakWithLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

//		int i = 1;
//		while (i <= 10) {
//			if (i == 6) {
//				break;
//			}
//			System.out.print(i + " ");
//			i++;
//		}
		
		
		for (int i = 1; i <=n; i++) {
			if(i==6) {
				break;
			}
			System.out.print(i + " ");
		}
	}

}
