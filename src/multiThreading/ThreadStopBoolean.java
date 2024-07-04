package multiThreading;

public class ThreadStopBoolean implements Runnable{

	boolean stop=false;
	@Override
	public void run() {
		System.out.println("Thread is Running ");
		int i=0;
		while(i<10) {
			System.out.print(i+" ");
			if(i==5) {
				if(stop==true) {
					break;
				}
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStopBoolean ts = new ThreadStopBoolean();
		Thread t = new Thread(ts);
		t.start();
		ts.stop=true;//we can use this method instead of stop method that is inbuilt in Thread class
	}

}
