package com.SynchronizedBlock;

public class College {
	public static void main(String[] args) throws InterruptedException {
		PrintInfo p = new PrintInfo();
		Thread1 t1 = new Thread1(p); 
		Thread2 t2 = new Thread2(p); 
		Thread3 t3 = new Thread3(p);	
		
		t3.start();
		t1.start();		
		t2.start();	
		
	}
}
