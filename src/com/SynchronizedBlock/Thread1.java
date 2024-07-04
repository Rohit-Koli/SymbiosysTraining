package com.SynchronizedBlock;

public class Thread1 extends Thread{
	
	PrintInfo p;
	
	@Override
	public void run() {
		int []a= {101,102,103,104,105};
		p.print(a);
	}
	
	Thread1(PrintInfo p){
		this.p=p;
	}
}
