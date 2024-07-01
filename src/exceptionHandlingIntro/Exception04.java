package exceptionHandlingIntro;

import java.util.Scanner;

public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username !");
		String uname=sc.nextLine();
		System.out.println("Enter Your Password !");
		String pass=sc.nextLine();
		try {
		if(uname.equals("abc")&& pass.equals("123")) {
			System.out.println("Registered Succesfully");			
		}else {
			throw new PasswordValidatorException("Username or Password is incorrect !");
		}}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("HEllo :"+uname);
		System.out.println("Your Password is :"+pass);
		System.out.println("Programme is terminated ");
	}

}
