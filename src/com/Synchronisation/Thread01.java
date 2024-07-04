package com.Synchronisation;

public class Thread01 extends Thread{
	TablePrinter t;
	
	public void run() {
		t.TablePrint(10.11);
	}
	
	public Thread01(TablePrinter t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
}
