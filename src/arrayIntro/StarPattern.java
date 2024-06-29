package arrayIntro;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("...........");
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
