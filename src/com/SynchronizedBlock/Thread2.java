package com.SynchronizedBlock;


public class Thread2 extends Thread{
	PrintInfo p;
	
	@Override
	public void run() {

		int arr[]= {201,202,203,204,205};
		p.print(arr);
	}
	
	Thread2(PrintInfo p){
		this.p=p;
	}
}
