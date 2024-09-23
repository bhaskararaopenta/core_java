package com.day5.Assignment3;

public class MainClass {
	
	public static void main(String[] args) {

		CurrentAccount ca=new CurrentAccount(123456, 5000);
		
		System.out.println("this details is CURRENTACCOUNT");
		System.out.println("the Total Balance in CurrentAccount is : "+ca.balance);
		System.out.println("the Amount Credited to CurrentAccount is : "+ca.deposit(5000));
		System.out.println("the Total Balance in CurrentAccount is : "+ca.balance);
		
		System.out.println("the Total Balance in CurrentAccount is : "+ca.balance);
		System.out.println("the Amount Debiting to CurrentAccount is : "+ca.withdraw(2000));
		System.out.println("the Total Balance in CurrentAccount is : "+ca.balance);
		
		
		
		SavingsAccount sa=new SavingsAccount(654321, 2000);
		
		System.out.println("this details is SAVINGACCOUNT");
		System.out.println("the Total Balance in SavingAccount is : "+sa.balance);
		System.out.println("the Amount Credited to SavingAccount is : "+sa.deposit(5000));
		System.out.println("the Total Balance in SavingAccount is : "+sa.balance);
		
		System.out.println("the Total Balance in SavingAccount is : "+sa.balance);
		System.out.println("the Amount Debiting to SavingAccount is : "+sa.withdraw(3000));
		System.out.println("the Total Balance in SavingAccount is : "+sa.balance);
	}

}
