package multiThreading;

public class ThreadJoin implements Runnable{

	@Override
	public void run() {
		System.out.println("Child thread is running ");
		
		for(int i=1;i<5;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nChild thread ended");
	}
	
	public static void main(String[] args) {
		ThreadJoin tj = new ThreadJoin();
		Thread t = new Thread(tj);
		t.start();
		
//		ThreadJoin tj2 = new ThreadJoin();
//		Thread t2 = new Thread(tj2);
//		t.start();
		try {
			t.join(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Main thread End ");
	}
}
