package arrayIntro;

public class ArrEqualOrNotProg {

	public static void main(String[] args) {
		int[] arr1= {0,9,8,7,6,5,4};
		int[] arr2= {0,9,8,7,6,5,4};
		int flag=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Array Elements are NOt Same !");
		}else {
			System.out.println("Array Elements are Same !");
		}
	}

}
