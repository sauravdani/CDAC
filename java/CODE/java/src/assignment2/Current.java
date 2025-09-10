package assignment2;

public class Current extends Account {
	public Current(int account_no,String name,double balance) {
		super(account_no,name,balance);

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= 5000) {
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
			System.out.println("Only upto 5000Rs can withdraw at a time");
		}
		
		
	}

	@Override
	public void deposit(double amount) {
		if (amount > 500000) {
			System.out.print("Maximum limit is 5 lakh");
		}
		else {
			System.out.println(amount+" Rs deposited");
			balance = balance + amount;
			System.out.println("Total balance is: "+balance);
		}
		
	}
		
}
	


