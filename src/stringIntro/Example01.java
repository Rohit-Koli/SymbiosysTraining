package stringIntro;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TO calculate vovels and other words in a particular string
		int vovels=0;
		int consonents=0;
		String name="rohit himmat koli ";
		int n=name.length();
		char arr[]= new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=name.charAt(i);
		}
		for(int i=0;i<n;i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u' ) {
				vovels++;
			}else {
				consonents++;
			}
		}
		System.out.println("vovels are : "+vovels);
		System.out.println("consonents are : "+consonents);
	}

}
