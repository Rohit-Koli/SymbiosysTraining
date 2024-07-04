package multiThreading;

public class ThreadStopClass2 implements Runnable{
	int flag=0;
	
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i+" ");
			if(i==6) {
				if(!Thread.currentThread().isInterrupted()){//One More method to stop thread 
					System.out.println("Interrupted ? :"+!Thread.currentThread().isInterrupted());
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadStopClass2 ts2 = new ThreadStopClass2();
		Thread t = new Thread(ts2);
		t.start();
		
		
	}

}
