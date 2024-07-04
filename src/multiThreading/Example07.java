package multiThreading;

public class Example07 implements Runnable{
	
	Thread t1;
	@Override
	public void run() {
		System.out.println("Thread is Running ");
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
			if(i==5) {
				t1.stop();			
			}
		}
	}
	
	public static void main(String[] args) {
		Example07 e = new Example07();
		Thread t = new Thread(e);
		t.start();
		t.start();
	}
}
