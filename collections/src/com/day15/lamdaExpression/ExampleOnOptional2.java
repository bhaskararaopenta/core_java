package com.day15.lamdaExpression;

import java.util.Optional;

public class ExampleOnOptional2 {
	public static void main(String[] args) {
		String msg = null;
		String msg2 = "rahul";
		Optional<String> opt = Optional.of(msg2); // of() must pass the non-null value
		String optOut = opt.get();
		System.out.println(optOut);

		String msg3 = null;
		String out1 = Optional.ofNullable(msg3).orElse("smith");
		System.out.println(out1);

		String s = null;
		String out2 = Optional.ofNullable(msg).orElseGet(() -> "fazil");
		System.out.println(out2);

		String s2 = "amar";
		Optional<String> pt2 = Optional.ofNullable(s2);
		if (pt2.isPresent()) {
			System.out.println(pt2.get());
		} else {
			System.out.println("is not present");
		}

		String s3 = "welcome";
		Optional<String> pt3 = Optional.ofNullable(s3);
		pt3.ifPresent(st -> System.out.println(st.length()));

		String s4 = null;
		String st1 = Optional.ofNullable(s4).orElseThrow();
		System.out.println(st1);
	}
}
