package randomIntro;

import java.util.Random;

public class OtpGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		long otp=r.nextLong(1000000,9999999);
		System.out.println("OTP is :"+otp);
	}

}
