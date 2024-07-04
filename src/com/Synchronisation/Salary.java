package com.Synchronisation;

public class Salary {
	double addAmount;
	double totalSalary=30000;
	static double expenses;
	double remaining;
	
	synchronized void showExpenses(double expenses) {
		if(totalSalary>expenses) {
			System.out.println("Payment Success");
			totalSalary+=addAmount;
			remaining=totalSalary-expenses;
			totalSalary-=expenses;
			System.out.println("Remaining Amount :"+remaining);
		}else {
			throw new InsufficientFundException("Insufficient Balance !");
		}		
	}
	
	public static void main(String[] args) {
		Salary s = new Salary();
		s.showExpenses(4500);
		s.showExpenses(400);
	}
}
