package com.day15.lamdaExpression;

import java.util.Optional;

public class ExampleOnOptional {
	public static void main(String[] args) {
		String msg = null;
		String msg2 = "rahul";
		Optional<String> opt = Optional.ofNullable(msg);
		Optional<String> opt1 = Optional.ofNullable(msg2);
		if (opt.isEmpty()) {
			System.out.println("msg  string object is empty");
		} else {
			System.out.println("Msg string object is not empty : " + msg);
		}
		if (opt1.isEmpty()) {
			System.out.println("msg  string object is empty");
		} else {
			System.out.println("Msg string object is not empty : " + msg2);
		}

	}
}
