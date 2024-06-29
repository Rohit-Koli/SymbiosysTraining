package stringIntro;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "India";
		String s2 = new String();
		s2="Maharashtra";
		
		System.out.println(s1.concat(s2));
		
		String s3 = new String("Shirpur");
		System.out.println(s3);
		s3="Pune";
		System.out.println("Updated Value is "+s3);
		//Print the character of String using index value
		System.out.println(s2.charAt(2));
		
		//use to find the element and if it contains the it will return true else false
		System.out.println(s3.contains("P"));
		System.out.println(s3.contains("q"));
		
		//Check that the string is end with the character or not 
		System.out.println(s3.endsWith("q"));
		System.out.println(s3.endsWith("E"));
		System.out.println(s3.endsWith("e"));
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3);
	}

}
