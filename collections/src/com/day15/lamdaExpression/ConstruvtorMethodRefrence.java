package com.day15.lamdaExpression;

public class ConstruvtorMethodRefrence {

	public static void main(String[] args) {

		Messageable mobj = Message::new;

		Message m = mobj.getMsg("Bhaskar");
	}
}
