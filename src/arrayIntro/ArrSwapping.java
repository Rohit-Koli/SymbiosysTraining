package arrayIntro;

public class ArrSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] arr3= {7,8,9};
		
		int[][] tempArr= {arr1,arr2,arr3};
		arr1=tempArr[1];
		arr2=tempArr[2];
		arr3=tempArr[0];
		System.out.println("1st Array After Swapping With 2nd Array ");
		for(int i:arr1) {
			System.out.println(i);
		}
		System.out.println("2nd Array After Swapping With 3rd Array ");
		for(int i:arr2) {
			System.out.println(i);
		}
		System.out.println("3rd Array After Swapping With 1st Array ");
		for(int i:arr3) {
			System.out.println(i);
		}
		

	}

}
