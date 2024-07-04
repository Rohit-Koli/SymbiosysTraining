package multiThreading;

public class SecondThread implements Runnable{
	
	static Thread t;
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				t.stop();
			}
			System.out.println("Second thread : "+i);
		}
		System.out.println("End ");
	}

}
