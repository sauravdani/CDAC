package Assignment4_1;

public class Account {
	
	float balance ;
	int accountId ;
	
	public Account(int acc, float bal){
		balance = bal;
		accountId = acc;
	}
		
	public boolean equals(Object obj) {
		Account ac = (Account)obj;
		if ( ac.getAccount() == this.getAccount())  {
			return true;
		}
		return false;
	}
	
	public  void  deposit(float money) throws DepositLimitExceededException{
		if (money > 100000) {
			throw new DepositLimitExceededException("The amount of money you tried to deposit is very big");
		}
		this.balance = balance + money;
		
	}
	
	public  void  withdrawl(float money) throws WithdrawlLimitExceededException , BankBalanceTooLowException{
		if (money > balance) {
			throw new BankBalanceTooLowException("The amount of money you tried to Withdrawl is more then your balance");
		}
		if (money > 100000) {
			throw new WithdrawlLimitExceededException("The amount of money you tried to Withdrawl is too big");
		}
		this.balance = balance - money;
		
	}
	
	public float getBalance() {
		return balance;
	}
	
	public int getAccount() {
		return accountId;
	}

}
