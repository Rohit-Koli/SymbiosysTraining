package stringIntro;

public class StringBufferIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb  = new StringBuffer();
//		It will print the current capacity of StringBuffer
		System.out.println(sb.capacity());
		sb.append("Rohit");
		System.out.println(sb);
		sb.append(" Koli");
//		TO reverse the StringBuffer
		System.out.println(sb.reverse());
//		To Calculate the length
		System.out.println(sb.length());
//		To set a particular charecter at specific index
		sb.setCharAt(0,'I');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
//		We can define the capacity in parameters also
		StringBuffer sb2 = new StringBuffer(200);
		System.out.println(sb2.capacity());
		
//		Another Way to define the stringBuffer 
		StringBuffer sb3 = new StringBuffer("HEllo");//16+5
		System.out.println(sb3.capacity());
		sb3.append("qwertyuiopasdfgh");
		System.out.println(sb3.capacity());
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("			Rohit			Koli 		");
		System.out.println(sb4.length());
		sb4.trimToSize();
		System.out.println(sb4.length());
		
//		Ensure Capacity ensures the StringBuffer is capacity is insure or not 
		System.out.println("Capacity is : "+sb4.capacity());
		sb4.ensureCapacity(30);
		
		
	}

}
