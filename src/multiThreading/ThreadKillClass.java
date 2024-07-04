package multiThreading;

public class ThreadKillClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft = new FirstThread();
		Thread t1 = new Thread(ft);
		
		SecondThread st = new SecondThread();
		Thread t2 = new Thread(st);
		t1.start();
		t1.stop();
		t2.start();
		
	}

}
