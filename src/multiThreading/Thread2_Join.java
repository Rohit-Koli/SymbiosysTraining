package multiThreading;

public class Thread2_Join implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread2 is Running");
		for(int i=0;i<3;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nThread2 Ended");
	}
}
