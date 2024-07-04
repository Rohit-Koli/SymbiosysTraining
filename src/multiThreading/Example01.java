package multiThreading;

public class Example01 extends Thread{
	
	String msg;
	String name;
	public Example01(String name,String msg) {
		this.name=name;
		this.msg=msg;
	}
	public void run() {
		if(msg.equals("pass"))
			System.out.println("Passes the Exam");
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		System.out.println("Congratulations :"+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example01 ex = new Example01("Rohit", "pass");
		ex.run();

	}

}
