package arrayIntro;

public class PalindromeNumbersCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,121,878,23,90,34,909};
		int numOfPalindrome=0;
		int sum=0;
		int r;
		int temp;
		int n;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			n=arr[i];
			while(n>0) {
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
				if(sum==temp) {
					numOfPalindrome=numOfPalindrome+1;
				}
			}
			
		}
		System.out.println("Number of Palindrome Numbers in Array Are : "+numOfPalindrome);
	}

}
