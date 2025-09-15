package assignment4;

public class ShiftLeft {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = s.substring(1).concat(s.substring(0, 1));
		
		System.out.println(s1);
	}

}
