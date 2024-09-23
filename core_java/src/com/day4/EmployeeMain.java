package com.day4;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// 1 st way to initialize and getter 
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("Bhaskar");
		emp.setEmpSal(10);

		System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpSal());
		
		
		// 2nd way to initialize and getter
		System.out.println("this type using constructor to initialize and getter");
		Employee emp1=new Employee(321, "Siva", 200);
		System.out.println(emp1.getEmpId() + " " + emp1.getEmpName() + " " + emp1.getEmpSal());
		
	}

}
