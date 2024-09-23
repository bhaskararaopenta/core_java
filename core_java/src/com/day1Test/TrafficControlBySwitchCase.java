package com.day1Test;

import java.util.Scanner;

public class TrafficControlBySwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("choose option below");
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. Green");
		int choice=scan.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Stop");
			break;
			
		case 2:
			System.out.println("Ready");
			break;
			
		case 3:
			System.out.println("Go");
			break;

		default:
			System.out.println("Invalid Option");
			break;
		}
	}

}
