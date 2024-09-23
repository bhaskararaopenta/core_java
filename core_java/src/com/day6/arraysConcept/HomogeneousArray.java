package com.day6.arraysConcept;

public class HomogeneousArray {

	public static void main(String[] args) {

		Object obj[] = new Object[5];
		System.out.println("Initialize the array using scanner class");

		obj[0] = "smith";
		obj[1] = true;
		obj[2] = 'c';
		obj[3] = 10.0f;
		obj[4] = 10;

		System.out.println("printing using forloop");
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");
		}
		System.out.println();

		System.out.println("printing using enhanced For loop");
		for (Object object : obj) {
			System.out.println(object);
		}
	} 

}
