package multiThreading;

public class ThreadPriority extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriority th = new ThreadPriority();
		Thread t = new Thread(th,"Thread 01");
		//We can set the priority using below method 
		//We can set priority upto 10 and above 10 we cannot set the priority
		t.setPriority(2);
		System.out.println("Priority :"+t.getPriority());
		System.out.println("Name : "+t.getName());
		t.start();
	}

}
