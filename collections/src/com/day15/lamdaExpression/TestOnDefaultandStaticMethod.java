package com.day15.lamdaExpression;

public class TestOnDefaultandStaticMethod {
	public static void main(String[] args) {
		A aobj = new A();
		aobj.m1();
		aobj.m2();
		aobj.display(); // accessing default method
		B bobj = new B();
		bobj.m1();
		bobj.m2();
		bobj.display(); // accessing default method
		System.out.println(XYZ.sayHello("Rahul"));// accessing static method

	}
}




//Java 8 Interface Changes – default method and static method:
//============================================================
//Interface in java can only have abstract methods. All the methods of interfaces are public & abstract Only.
// 
//Java 8 allows the interfaces to have default and static methods.
// 
//The reason we have default methods in interfaces is to allow the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.
// 
//default method:
//----------------
//For example, if several classes such as A, B, C and D implements an interface XYZ Interface then if we add a new method to the XYZ Interface, we have to change the code in all the classes(A, B, C and D) that implements this interface.
// 
//In this example we have only four classes that implements the interface which we want to change but imagine if there are hundreds of classes implementing an interface then it would be almost impossible to change the code in all those classes.
// 
//This is why in java 8, we have a new concept “default methods”. These methods can be added to any existing interface and we do not need to implement these methods in the implementation classes mandatorily, thus we can add these default methods to existing interfaces without breaking the code.(Backward compatibility ->with out changing the older code)
// 
//Static methods:
//---------------
//Static methods interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.