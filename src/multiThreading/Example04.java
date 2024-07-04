package multiThreading;

public class Example04 extends Thread{

	public void run() {
		for(int i=0;i<3;i++) {
			
			try {
				System.out.println("Example 04 class Thread Running "+i);
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
			
		}
		System.out.println("Example 04 class End ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
