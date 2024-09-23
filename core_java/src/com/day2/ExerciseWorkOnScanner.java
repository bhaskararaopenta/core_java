package com.day2;

import java.util.Scanner;

public class ExerciseWorkOnScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id number");
		int emplyoeeId=sc.nextInt(); 
		System.out.println("enter the name");
		String eName=sc.next()+sc.nextLine();  // first way
		
//		sc.nextLine();
//		String ename=sc.nextLine(); // second way
		System.out.println("enter the sal");
		 double sal=sc.nextDouble();
		
		System.out.println("the employee id is :"+emplyoeeId);
		System.out.println("the emplyoee Name :"+eName);
		System.out.println("the emplyoee salary :"+sal);

	}

}
