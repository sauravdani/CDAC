package assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		int n;
		System.out.print("enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(f.fib(n));

	}

}
