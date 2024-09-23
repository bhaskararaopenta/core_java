package com.day6.exceptionHandling;

public class ExceptionDemo8 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--statement---");
		// first way
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Thread.sleep(2000);

		System.out.println("statement-n");
		System.out.println("end of the program");
	}

}
