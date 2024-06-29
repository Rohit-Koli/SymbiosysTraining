package stringIntro;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="          Rohit      Koli     ";
		int space=0;
		int totalChars=0;
		for(int i=0;i<name.length();i++) {			
			if(name.charAt(i)==' ') {
				space++;
			}else {
				totalChars++;
			}
		}
		System.out.println("Total White Spaces : "+space);
		System.out.println("Total Characters : "+totalChars);
		String newStr=name.replace(" ", "");
		System.out.println(newStr.toLowerCase());
	}

}
