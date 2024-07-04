package com.Synchronisation;

public class TableMain {
	public static void main(String[] args) {
		TablePrinter tp = new TablePrinter();
		Thread01 t1 = new Thread01(tp);
		t1.start();
		
		Thread01 t2 = new Thread01(tp);
		t2.start();
	}
}
