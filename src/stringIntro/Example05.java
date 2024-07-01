package stringIntro;

import java.util.Random;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shuffle a String in a Random manner
		Random r = new Random();
		String word="Hello World";
		char[] ch = new char[word.length()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=word.charAt(r.nextInt(word.length()));
		}
		for(char c:ch) {
			System.out.print(c);
		}
//		System.out.println(new String(ch));
	}

}
