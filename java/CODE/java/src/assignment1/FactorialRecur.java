package assignment1;
import java.util.*;

public class FactorialRecur {
	
	public static int fact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		int n;
		System.out.print("enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("The factorial is: " + fact(n));

	}

}
