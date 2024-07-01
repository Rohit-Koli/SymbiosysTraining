package stringIntro;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checking string is palindrom or not
		String str= "Nayan";
		String s="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			s=ch+s;
		}
		if(str.equalsIgnoreCase(s)) {
			System.out.println("String is Palindrome");
		}else { 
			System.out.println("String is Not Palindrome");
		}
	}

}
