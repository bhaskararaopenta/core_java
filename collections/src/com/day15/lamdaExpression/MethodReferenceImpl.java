package com.day15.lamdaExpression;

public class MethodReferenceImpl {

	public String display(String m) {
		// TODO Auto-generated method stub
		return "HI" + m;
	}

	public static String sayMsg(String m) {
		// TODO Auto-generated method stub
		return "HI" + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// methodRefrence the instance method
		MethodReferenceImpl iobj=new MethodReferenceImpl();
		MethodRefrence tobj=iobj::display; // instance
		
		String msg = tobj.sayHello("Welcome");
		System.out.println(msg);
		
		//methodRefrence using classsname
		MethodRefrence tobj1=MethodReferenceImpl::sayMsg;
		String msg1 = tobj1.sayHello("Hello raju");
		System.out.println(msg1);
	}

}
