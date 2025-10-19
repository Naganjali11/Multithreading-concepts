package com.codegnan.multithreading;

public class BankAccount {
	private double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
public synchronized void withdraw(String user, double amount) {
	System.out.println(user+"trying to withdraw:"+amount);
	if(balance>=amount) {
		System.out.println(user+"is processing the withdrawl");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance-=amount;
		System.out.println(user+"completed withdrawl. Remaining balance:"+balance);		
	}else {
		System.out.println(user+"Insufficient Funds! Available balance:"+balance);
	}
	System.out.println("----------------------------");
}
}
