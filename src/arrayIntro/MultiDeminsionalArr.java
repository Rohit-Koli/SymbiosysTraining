package arrayIntro;

public class MultiDeminsionalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] MultArr= new int[3][4][5];
		int val=10;
		int ele=0;
		
		
		for(int i=0;i<3;i++) {			
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					MultArr[i][j][k]=val;
					val++;
					ele++;
				}				
			}
		}
		
		for(int i=0;i<3;i++) {			
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					System.out.print(MultArr[i][j][k]+" ");
				}
				System.out.println("");
			}
		}		
		System.out.println(ele);
		
	}

}
