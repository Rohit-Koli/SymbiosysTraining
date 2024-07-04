package multiThreading;

public class Example05 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		Example05 e = new Example05();
		Thread t1 = new Thread(e,"Thread 01 ");
		t1.setPriority(5);
		Thread t2 = new Thread(e,"Thread 02 ");
		t2.setPriority(9);		
		Thread t3 = new Thread(e,"Thread 03 ");
		t2.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
		int t=Thread.activeCount();
		System.out.println(t);
		
	}

}
