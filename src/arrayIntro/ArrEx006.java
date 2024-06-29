package arrayIntro;

public class ArrEx006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int arr2[] = {1,2,30};
		int flag=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr2[i]==arr[j]) {
					flag++;
				}
			}
		}
		if(flag==3) {
			System.out.println("Array 2 is Sub Element of Array 1");
		}else {
			System.out.println("Array 2 is Not a Sub Element of Array 1");
		}
		
	}

}
