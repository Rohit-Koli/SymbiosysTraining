package exceptionHandlingIntro;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		int val=89;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Array Element Find at :"+i+"th Position !");
				i=arr.length-1;
			}
		}
	}

}
