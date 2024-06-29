package stringIntro;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello Rohit ";
		str=str.toLowerCase();
		char[] ch2= new char[str.length()];
		String temp;
		int repeat=0;
		char[] ch = new char[str.length()];
		temp=str.replace(" ", "");
		for(int i=0;i<str.length();i++) {			
			ch[i]=temp.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==temp.charAt(i)) {
				repeat++;
			}
		}
		System.out.println();
		
	}

}
