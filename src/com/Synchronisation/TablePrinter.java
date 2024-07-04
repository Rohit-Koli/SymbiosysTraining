package com.Synchronisation;

public class TablePrinter {
	
	 void TablePrint(double n) {
		 synchronized (this) {		 
		for(int i=1;i<11;i++) {
			System.out.print(i*n+" ");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
		System.out.println();
		 }
	}
	
}
