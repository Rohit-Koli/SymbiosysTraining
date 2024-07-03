package multiThreading;

public class MyThread implements Runnable{
	public void run() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even Numbers : "+i);
			}
		}
	}
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread th = new Thread(m);
		th.start();
	}
}
