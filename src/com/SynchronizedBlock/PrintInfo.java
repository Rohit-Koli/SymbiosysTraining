package com.SynchronizedBlock;

public class PrintInfo {
	
	void print(int arr[]) {
		synchronized (this) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		
	}
}
