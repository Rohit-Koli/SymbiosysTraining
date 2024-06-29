package arrayIntro;

public class MultArrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[3][3];
		int value=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
		System.out.println("");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=value;
				value++;
			}
		}
		System.out.println("......................");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}				
		System.out.println("");
		}
	}

}
