package multiThreading;

public class Example06 extends Thread{

	static Thread t;
	
	@Override
	public void run() {
		System.out.println("Running");
		t.stop();
		System.out.println("End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example06 e = new Example06();
		t = new Thread(e);
		t.start();
	}

}
