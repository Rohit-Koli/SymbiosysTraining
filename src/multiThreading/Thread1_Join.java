package multiThreading;

public class Thread1_Join implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1 is Running");
		for(int i=0;i<3;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nThread1 Ended");
	}
	
}
