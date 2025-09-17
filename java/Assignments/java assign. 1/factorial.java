package assignment1;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 1;
		
		for (int i=1; i<=n; i++) {
			ans=ans*i;
		}
		System.out.print(ans);

	}

}
