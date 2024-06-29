package arrayIntro;

public class MultiDemensionalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] multArr= {{{80,78,79},{76,69,88},{78,67,79}},
				{{93,88,86},{92,84,82},{77,78,81}},
				{{76,69,88},{80,78,79},{78,67,79}}						
		};
		
		for(int i=0;i<multArr.length;i++) {
			for(int j=0;j<multArr.length;j++) {
				for(int k=0;k<multArr.length;k++) {
					System.out.print(multArr[i][j][k]+" ");
				}
				System.out.println("");
			}
			
		}
	}

}
