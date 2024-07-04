package multiThreading;

public class MainJoin {
	public static void main(String[] args) {
		Thread1_Join tj1 = new Thread1_Join();
		Thread t1 = new Thread(tj1);
		
		Thread2_Join tj2 = new Thread2_Join();
		Thread t2 = new Thread(tj2);
		
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
}
