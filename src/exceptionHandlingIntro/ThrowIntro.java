package exceptionHandlingIntro;

public class ThrowIntro {
	
	public static void MarksChecker(double marks) {
		if(marks<40) {
			throw new ArithmeticException("Failed !");
		}else {
			System.out.println("Pass !");
		}
	}
	
	public static void NameChecker(String name){
		if(name=="") {
			throw new NullPointerException("Name Should NOt be Empty");
		}else {
			System.out.println(name);
		}
	}
	public static void AgeValidator(int age) {
		if(age>=18){
			System.out.println("You are eligible for Vote ");
		}else {
			throw new ArrayIndexOutOfBoundsException("you are Not eligible to vote !");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MarksChecker(89);
//		MarksChecker(29);
//		String h;
//		NameChecker("");
		try {
			AgeValidator(10);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
