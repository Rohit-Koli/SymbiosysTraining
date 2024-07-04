package multiThreading;

public class YieldMethod implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldMethod ym = new YieldMethod();
		Thread t = new Thread(ym,"First Thread");
		
		
		YieldMethod ym2 = new YieldMethod();
		Thread t2 = new Thread(ym2,"Second Thread");
		
		YieldMethod ym3 = new YieldMethod();
		Thread t3 = new Thread(ym3,"Third Thread");
		
		t.start();
		t2.start();
		t3.start();
	}

}
