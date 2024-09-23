package com.day2;

public class Chair {
	
	
	//object properties  //instance variables
	String material="plastic";  
	String color="black";
	int noOfWheels=4;

	//defing chair object behaviour in the form of methods
	//instance methods
	public void chairMoveable() {
		System.out.println("chair is movable"); 

	}
	
	public void seatHeightAdjustable() {
		System.out.println("chair seat height can be adjustable");

	}
	public static void main(String[] args) {
		//syntax to create the object for the class
		//ClassName referenceVariable =new ClassName
		Chair chair=new Chair();
		
		//accessing the instance variables using referenceName.variableName
		System.out.println(chair.color);
		System.out.println(chair.material);
		System.out.println(chair.noOfWheels);
		
		//calling the instance methods using referenceName.methodName();
		chair.chairMoveable();
		chair.seatHeightAdjustable();

	}

}
