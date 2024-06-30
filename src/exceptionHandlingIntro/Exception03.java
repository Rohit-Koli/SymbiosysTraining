package exceptionHandlingIntro;

public class Exception03 {

	public static void main(String[] args) {
		//try and finally block 
		
		try {
			int a=1/0;
			System.out.println(a);
		}finally {
			System.out.println("Its End Of Programme !");
		}
	}

}
