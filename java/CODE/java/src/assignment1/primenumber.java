package assignment1;

import java.util.*;


public class primenumber {
	public static void main(String[] args) {
		int n;
		System.out.println("ENter the number to print all prime numbers");
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		boolean flag = false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("It is not prime");
		}
		else {
			System.out.println("It is prime");
		}
	}
} 
