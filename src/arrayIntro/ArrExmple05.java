package arrayIntro;

import java.util.Scanner;

public class ArrExmple05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("");
//		int size=sc.nextInt();
		int arr[]= {1,2,6,4};
//		System.out.println("Enter 5 Values ");
//		for(int i=0;i<arr.length;i++) {
//			int temp=sc.nextInt();
//			arr[i]=temp;
//		}
		System.out.println("Reverse Array is ");
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i:arr) {
			System.out.println(i+" ");
		}
		

	}

}
