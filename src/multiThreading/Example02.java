package multiThreading;

public class Example02 extends Thread{

	String task;
	
	public Example02(String task) {
		this.task=task;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" "+task);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example02 e1 = new Example02("1st Year ");
//		e1.run();
		Example02 e2 = new Example02("2nd Year ");
//		e2.run();
		Example02 e3 = new Example02("3rd Year ");
//		e3.run();
		
		Thread t1 = new Thread(e1);
		t1.start();
		Thread t2 = new Thread(e2);
		t2.start();
		Thread t3 = new Thread(e3);
		t3.start();
		
		int threadCount=Thread.activeCount();
		System.out.println(threadCount+" Active Threads ");
		
	}

}
