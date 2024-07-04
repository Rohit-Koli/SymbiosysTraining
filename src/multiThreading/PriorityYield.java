package multiThreading;

public class PriorityYield extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityYield py = new PriorityYield();
		Thread t = new Thread(py,"First Thread ");
		t.setPriority(8);
		
		PriorityYield py2 = new PriorityYield();
		Thread t2 = new Thread(py2,"Second Thread ");
		t2.setPriority(2);
		
		PriorityYield py3 = new PriorityYield();
		Thread t3 = new Thread(py3,"Third Thread ");
		t3.setPriority(5);
		
		t.start();
		t2.start();
		t3.start();
		
	}

}
