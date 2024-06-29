package arrayIntro;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Transpose = row = columns and columns =row
		int arr[][]= new int[3][3];
		int value=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=value;
				value++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}				
		System.out.println("");
		}
		System.out.println("......................");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}				
		System.out.println("");
		}
//		System.out.println("");
	}

}
