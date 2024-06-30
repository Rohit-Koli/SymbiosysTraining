package exceptionHandlingIntro;

public class Exception02 {

	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace();//Print the detailed exception information 
			try {
				int arr[]= new int[1];
				arr[3]=1;
			} catch (Exception e2) {
//				If we don't know which error will get occurs then we use Exception class to print the Exception
				e2.printStackTrace();
				try {
					String s=null;
					System.out.println(s.charAt(2));
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Throwable e) {
			/* If we don't know it is exception or not then we use the Throwable class
		 	   which is base class of all the exception class */
			
			/*
			 *When if we use the parent class of then we cannot call the child classes of it			  
			 */
			e.printStackTrace();
		}
		
	}

}
