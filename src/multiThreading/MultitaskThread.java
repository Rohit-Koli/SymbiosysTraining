package multiThreading;

public class MultitaskThread extends MyThread implements Runnable{
	
	int a=21,b=5;
	@Override
	public void run() {
		add();
		mult();
		sub();
		div();
		mod();
	}
	void mod() {
		System.out.println("Mod is :"+a%b);
	}
	void add() {
		System.out.println("Addition : "+(a+b));
	}
	
	void mult() {
		System.out.println("Multiplication : "+(a*b));
	}
	
	void sub() {
		System.out.println("Substraction : "+(a-b));
	}
	
	void div() {
		System.out.println("Division : "+(a/b));
	}
	
	public static void main(String[] args) {
		System.out.println("Its a Main thread ");
		MultitaskThread mt = new MultitaskThread();
		Thread th = new Thread(mt);
		th.start();
	}
}
