package multiThreading;

public class MultithreadingIntro extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		MultithreadingIntro mult = new MultithreadingIntro();
		mult.run();
	}

}
