package multiThreading;

public class MultipleThreads extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MultipleThreads mt = new MultipleThreads();
//		Thread th = new Thread(mt);
//		th.start();
		Thread.currentThread().setName("Thread 1");
//		mt.setName("Thread 01");
		mt.run();
		MultipleThreads mt2 = new MultipleThreads();
		Thread.currentThread().setName("Thread 2");
//		mt2.setName("Thread 02");
		mt2.run();
		MultipleThreads mt3 = new MultipleThreads();
		Thread.currentThread().setName("Thread 3");
//		mt3.setName("Thread 03");
		mt3.run();
		
		
	}

}
