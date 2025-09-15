package assignment4;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "ate";
		String s2 = "eate";
		
		
		if (s1.length()==s2.length()) {
			char[] s1_arry=s1.toCharArray();
			char[] s2_arry=s2.toCharArray();
			
			 Arrays.sort(s1_arry);
			 Arrays.sort(s2_arry);
			
			if (Arrays.equals(s1_arry,s2_arry) ) {
				System.out.println("Its an anagram");
			}
			else {
				System.out.println("Its not an anagram");
			}
		} 
		else {
			System.out.println("Its not an anagram");
		}

}
}
