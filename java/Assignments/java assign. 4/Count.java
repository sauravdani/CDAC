package assignment4;

public class Count {

	public static void main(String[] args) {
		String s = "This is Muddasar@123";
		
		int upper = 0;
		int lower = 0;
		int special = 0;
		
		char [] s_array = s.toCharArray();
		
		for (char i:s_array) {
			if ( (int)i >= 97 && (int)i<=122 ) {
				lower++;
			}
			else if (((int)i<= 90 && (int)i >= 65)) {
				upper++;
			}
			else {
				special++;
			}
		}
		
		System.out.println("The upper case characters are: " + upper);
		System.out.println("The lower case characters are: " + lower);
		System.out.println("The special characters are: " + special);
		
		
		

	}

}
