package arrayIntro;

public class ArrExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[10];
		arr[0]=1;
		arr[2]=2;
		arr[4]=3;
		arr[6]=4;
		arr[8]=5;
		arr[0]=6;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("This Position is Blank "+i);
			}
		}
	}

}
