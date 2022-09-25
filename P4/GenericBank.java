package com.P4;

public class GenericBank {
	
	protected double bankBalance;
	
	public static void welcome() {
		System.out.println("Welcome");
	}
	
	public void deposit(int amount) {
		bankBalance +=amount;
		System.out.println("Your current balance is: "+bankBalance);
	}
	public void withdraw(int amount) {
		bankBalance -=amount;
		System.out.println("Your current balance is: "+bankBalance);
	}
	
	 public void checkbalance () {
		 System.out.println("Your total balance is:"+bankBalance);
	 }
}
