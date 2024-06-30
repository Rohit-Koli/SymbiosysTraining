package exceptionHandlingIntro;

public class ExceptionHandlingIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
//		arr[2]=30;
		try {
			arr[3]=1000;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
