package multiThreading;

public class MainThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example03 e1 = new Example03();
		Thread t1 = new Thread(e1);
		t1.start();
		Example04 e2 = new Example04();
		Thread t2 = new Thread(e2);
		t2.start();
		int TCount=Thread.activeCount();
		int i=0;
		
		while(i<5) {
			System.out.println("Main Thread Running !");
			i++;
		}
		System.out.println("Main Thread Stopped here !");
		System.out.println("thread counts are :"+TCount);		
	}

}
