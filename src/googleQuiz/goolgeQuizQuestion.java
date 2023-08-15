package googleQuiz;

import java.util.HashMap;
import java.util.Map;
//hashmap-> match the entered values.
// String s="ABCDEFGHACEB" find the value which is repeat first.
//map is an interface so we have to derived hashmap from map.
public class goolgeQuizQuestion {
	public static String repeatChar(String s) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0 ; i<s.length();i++) {
			String character = s.substring(i, i+1);
			if(!hashMap.containsKey(character)) {
				hashMap.put(character,1);
			}else 
				return character;
		}
		return null;
	}
	public static void main(String[] args) {

		String s="ABCDEFGHACEB";
		System.out.println(repeatChar(s));
	}
}
