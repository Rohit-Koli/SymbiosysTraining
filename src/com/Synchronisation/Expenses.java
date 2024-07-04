package com.Synchronisation;

public class Expenses extends Thread{
	static double addAmount;
	static double expenses;
	static Salary s;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		s.showExpenses(expenses);
		System.out.println("***********");
	}
	
	public static void main(String[] args) {
		s = new Salary();
		Expenses traveling = new Expenses();
//		Thread t = new Thread(e);
		traveling.expenses=3500;
		traveling.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.getMessage();
		}
		
		Expenses accomodation = new Expenses();
		accomodation.expenses=4500;
		accomodation.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.getMessage();
		}
		
		Expenses food = new Expenses();
		food.expenses=3000;
		food.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.getMessage();
		}
		
		Expenses savings = new Expenses();
		savings.expenses=10000;
		savings.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.getMessage();
		}
		addAmount=7000;
		Expenses debt = new Expenses();
		debt.expenses=8000;
		debt.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.getMessage();
		}
		
//		Expenses udhari = new Expenses();
//		shokPani.expenses=8000;
//		shokPani.start();
//		try {
//			Thread.sleep(1000);
//		}catch (Exception e) {
//			e.getMessage();
//		}
		
	}
}
