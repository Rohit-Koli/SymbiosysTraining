package arrayIntro;

public class MultiDeminsionalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] MultArr= new int[5][5];
		MultArr[0][0]=1;
		MultArr[1][1]=20;
		MultArr[2][2]=30;
		MultArr[3][3]=40;
		MultArr[4][4]=50;
		
		
		
		for(int i=0;i<MultArr.length;i++) {			
			for(int j=0;j<MultArr.length;j++) {
				if(MultArr[i][j]==0) {
					int i1=i;
					int j2=j;
					MultArr[i][j]=MultArr[i][j];
				}
			}
		}
		
		for(int i=0;i<MultArr.length;i++) {
			for(int j=0;j<MultArr.length;j++) {
				System.out.print(MultArr[i][j]+" ");
			}				
			System.out.println("");
		}
		
	}

}
