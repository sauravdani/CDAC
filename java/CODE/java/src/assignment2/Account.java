package assignment2;

public abstract class Account {
	protected int account_no;
	protected String name;
	protected double balance;
	
	public Account(int account_no,String name,double balance) {
		this.account_no=account_no;
		this.name=name;
		this.balance=balance;
	}
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
}
