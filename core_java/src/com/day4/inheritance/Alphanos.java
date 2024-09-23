package com.day4.inheritance;

public class Alphanos extends Mango{
	
	String color;
	
	public void alphanosDetails() {
		System.out.println(this.color);

	}

	public static void main(String[] args) {
		Alphanos al=new Alphanos();
		al.shape="round";
		al.color="purple to yellow";
		al.taste="mild taste sweet";
		
		al.display();
		al.mangoDetails();
		al.alphanosDetails();

	}

}
  