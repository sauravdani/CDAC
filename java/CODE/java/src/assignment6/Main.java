package assignment6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main() {
//		List<String> sList = new ArrayList<String>();
//		String s = "hello";
		
		List<String> s = new ArrayList<String>();
		
		s.add("Hello");
		s.add("Its");
		s.add("elephant");
		s.add("tie");
		String vovels = "aeiouAEIOU";
		
		for (String word:s) {
			if (vovels.contains(word.substring(0, 1))){
				System.out.println(word);
			}
		}
	}
}
