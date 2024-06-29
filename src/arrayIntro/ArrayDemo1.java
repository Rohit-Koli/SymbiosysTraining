package arrayIntro;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		arr[3]=50;
		
//		for(int i:arr) {
//			System.out.println(i+"");
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		char[] chArr= new char[20];
		chArr[0]='H';
		chArr[1]='E';
		chArr[2]='L';
		chArr[3]='L';
		chArr[4]='O';
		
//		for(int i=0;i<5;i++) {
//			System.out.print(chArr[i]);
//		}
		
//		int[] ar= {1,2};
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 Numbers");
//		int n=sc.nextInt();		
		int[] EvenArr= new int[10];
		System.out.println("Enter 10 Values ");
		for(int i=0;i<10;i++) {			
			int temp=sc.nextInt();
			if(temp%2==0) {
				for(int j=0;j<EvenArr.length;j++) {
//					EvenArr[j]=temp;
					temp=EvenArr[i];
				}
			}
		}
		System.out.println("Even Numbers are :");
		for(int i=0;i<EvenArr.length;i++) {
			System.out.print(EvenArr[i]+" ");
		}
			
		
		
	}

}
