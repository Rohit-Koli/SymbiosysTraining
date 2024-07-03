package stringIntro;
import java.util.HashMap;
import java.util.Map;
public class Example04 {
	public static void main(String[] args) {
		//Check duplicate elements in String an which character is repeated how many times
		String str="Strawberry";
		char[] ch = new char[str.length()];
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		}				
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			System.out.println("Charac]ers :"+m.getKey()+" values :"+m.getValue());
		}
	}
}