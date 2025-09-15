package assignment4;

public class Equal {
	public void equal(String s1, String s2) {
		char[] s1_array = s1.toCharArray();
		char[] s2_array = s2.toCharArray();
		boolean check = true;
		
		if(s1.length() == s2.length()) {
			for (int i = 0; i < s1.length() ; i++) {
				if (s1_array[i] != s2_array[i]) {
					check = false;
					break;
				}
			}
		}
		
		if (check) {
			System.out.println("These are equal");
		}
		else {
			System.out.println("These not are equal");
		}
	}
	
	
	
	public void equalCase(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2= s2.toLowerCase();
		char[] s1_array = s1.toCharArray();
		char[] s2_array = s2.toCharArray();
		
		
		boolean check = true;
		
		if(s1.length() == s2.length()) {
			for (int i = 0; i < s1.length() ; i++) {
				if (s1_array[i] != s2_array[i]) {
					check = false;
					break;
				}
			}
		}
		
		if (check) {
			System.out.println("These are equal");
		}
		else {
			System.out.println("These not are equal");
		}
	}

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		Equal e = new Equal();
		
		System.out.println("Compering " + s + " and " + s1);
		e.equalCase(s1, s);
		System.out.println("Compering " + s1 + " and " + s2);
		e.equalCase(s2, s1);
		System.out.println("Compering " + s + " and " + s2);
		e.equalCase(s2, s);

	}

}
