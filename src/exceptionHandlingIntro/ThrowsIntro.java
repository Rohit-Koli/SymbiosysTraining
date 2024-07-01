package exceptionHandlingIntro;

import java.util.Scanner;

public class ThrowsIntro {
	
//	public static void AgeValidator(int age) {
//		if(age>=18){
//			System.out.println("You are eligible for Vote ");
//		}else {
//			throw new ArrayIndexOutOfBoundsException("you are Not eligible to vote !");
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		try {
		int age=sc.nextInt();
		if(age<18) {
			throw new AgeValidatorException("Not Eligible for vote !");
		}else {
			System.out.println("Eligible for vote !");
		}}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End of Programe");
//		sc.close();
	}

}
