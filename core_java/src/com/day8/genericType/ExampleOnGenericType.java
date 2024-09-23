package com.day8.genericType;

class GenericExampleType<T> {
	private T obt;

	public T getObt() {
		return obt;
	}

	public void setObt(T obt) {
		this.obt = obt;
	}

}

public class ExampleOnGenericType {

	public static void main(String[] args) {
		GenericExampleType<Integer> emgt = new GenericExampleType();
		emgt.setObt(1001);

		int n = emgt.getObt();
		System.out.println(n);
		
		
		GenericExampleType<Double> emgt2=new GenericExampleType();
		emgt2.setObt(1212.00);
		double m = emgt.getObt();
		System.out.println(m);

	}
}
