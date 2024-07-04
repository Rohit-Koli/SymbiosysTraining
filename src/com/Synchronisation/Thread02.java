package com.Synchronisation;

public class Thread02 extends Thread{

	TablePrinter t;
	
	public void run() {
		t.TablePrint(10.34);
	}
	
	public Thread02(TablePrinter t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
}
