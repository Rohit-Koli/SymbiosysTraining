package randomIntro;
import java.util.Random;
public class RandomIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int num=rn.nextInt(5,10);
		double d = rn.nextDouble(10);
		long mob=rn.nextLong(1000000000);
		float f = rn.nextFloat(10);
		boolean b=rn.nextBoolean();
		System.out.println("Random Numner is : "+num);
		System.out.println("Random Double is : "+d);
		System.out.println("Random Long is : "+mob);
		System.out.println("Random Float is : "+f);
		System.out.println("Random Boolean is : "+b);
	}

}
