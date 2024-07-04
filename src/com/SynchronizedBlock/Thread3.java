package com.SynchronizedBlock;

public class Thread3 extends Thread{
	PrintInfo p;
	
	@Override
	public void run() {

		int arr[]= {301,302,303,304,305};
		p.print(arr);
	}
	
	Thread3(PrintInfo p){
		this.p=p;
	}
}
