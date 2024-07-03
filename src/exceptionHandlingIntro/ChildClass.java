package exceptionHandlingIntro;

import java.io.IOException;

public class ChildClass extends ParentClass{

	@Override
	public void Hello(){		
		System.out.println("This is child class ");
	}
	
//	@Override
//	public static void Rohit() throws NullPointerException{
//		System.out.println("This is Rohit method ");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new ChildClass();
		try {
			p.Hello();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		parent.Hello();
		
//		Rohit();
		
	}

}
