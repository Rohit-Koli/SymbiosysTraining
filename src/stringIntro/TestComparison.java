package stringIntro;

public class TestComparison {

	public static void main(String[] args) {
		System.out.println("For String :");
		long StartTime0=System.currentTimeMillis();
		String subName="Java";
		for(int i=0;i<10000;i++) {
			subName.concat("Programming");			
		}
		System.out.println(System.currentTimeMillis()-StartTime0+" ms");
		System.out.println("For StringBuffer :");
		long StartTime=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for(int i=0;i<10000;i++) {
			sb.append("Programming");
			sb.reverse();
			
		}
		System.out.println(System.currentTimeMillis()-StartTime+" ms");
		
		System.out.println("For StringBUilder : ");
		
		long StartTime2=System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for(int i=0;i<10000;i++) {
			sb2.append("Programming");
			sb2.reverse();
		}
		System.out.println(System.currentTimeMillis()-StartTime2+" ms");
		
	}

}
