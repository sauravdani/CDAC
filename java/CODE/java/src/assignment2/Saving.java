package assignment2;

public class Saving extends Account {
	public Saving(int account_no,String name,double balance) {
		super(account_no,name,balance);

	}

	@Override
	public void withdraw(double amount) {
		if (balance >= 1000) {
			if (amount <= balance) {
				System.out.println(amount+" RS withdraw");
				balance = balance - amount;
				System.out.println("Remaing balance is: "+balance);
			}
			else {
				System.out.print("insufficent balance");
			}
			
			
		}
		else {
			System.out.println("Balance is less than 1000");
		}
		
	}

	@Override
	public void deposit(double amount) {
		if (amount > 100000) {
			System.out.print("Maximum limit is 1 lakh");
		}
		else {
			System.out.println(amount+" Rs deposited");
			balance = balance + amount;
			System.out.println("Total balance is: "+balance);
		}
		
	}
	
}
