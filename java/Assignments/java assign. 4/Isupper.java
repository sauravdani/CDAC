package assignment4;

public class Isupper {

	public static void main(String[] args) {
		String s = "THE TEAM INDIA";
		
		char [] s_array = s.toCharArray();
		boolean check = true;
		
		for (char i : s_array) {
			if (Character.isLowerCase(i)) {
				check = false;
				break;
			}
		}
		if (check)
		{
			System.out.println("Its a upper case");
			
		}
		else {
			System.out.print("Its not upper case");
		}
			

	}

}
