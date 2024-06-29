package arrayIntro;


import java.util.Scanner;

public class ArrExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Subjects ");
		int SubSize=sc.nextInt();
		String[] subs = new String[SubSize+1];
		System.out.println("Enter Subject Names ");
		for(int i=0;i<SubSize+1;i++) {
			String temp=sc.nextLine();
			subs[i]=temp;
		}
		System.out.println("Enter Marks For Subjects ");
		int[] marks= new int[SubSize];
		for(int i=0;i<SubSize;i++) {
			int temp=sc.nextInt();
			marks[i]=temp;
		}		
		
		int m=0;
		for(int i=0;i<SubSize;i++) {
			int t=marks[i];
			m+=t;
		}
		int avg=m/SubSize;
		System.out.println("Average Marks are : "+avg);
		
		if(avg<35) {
			System.out.println("Fail");
		}else if(avg>35 && avg<50) {
			System.out.println("D Grade");
		}else if(avg>=50 && avg<70) {
			System.out.println("C Grade");
		}else if(avg>=70 && avg<90) {
			System.out.println("B Grade");
		}else if(avg>=90 && avg<100) {
			System.out.println("A Grade");
		}
		
	}

}
