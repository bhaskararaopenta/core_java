package com.day7.strings;

public class GenericExample {
	private Object obt;

	public GenericExample() {
		super();

	}

	public Object getObt() {
		return obt;
	}

	public void setObt(Object obt) {
		this.obt = obt;
	}

	public static void main(String[] args) {

		GenericExample gex=new GenericExample();
		gex.setObt("smith"); // string type
		System.out.println(gex.getObt());
		
		gex.setObt('c'); // char type
		System.out.println(gex.getObt());
		
		gex.setObt(10); // int type
		System.out.println(gex.getObt());
	}
}
