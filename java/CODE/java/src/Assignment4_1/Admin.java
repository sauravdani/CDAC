package Assignment4_1;

public class Admin {

	public static void main(String[] args) {
			//throws DepositLimitExceededException, AccountAlreadyExistsException, BankBalanceTooLowException, WithdrawlLimitExceededException  {
		Account a1 = new Account(1, 1000.00f);
		Account a2 = new Account(2, 2000.00f);
		Account a3 = new Account(3, 10000.00f);
		System.out.println("balance before" + a1.getBalance());
		
		Backend accountDetails = new Backend();
		
		try {
			accountDetails.addAccount(a3);
			accountDetails.addAccount(a1);
			accountDetails.addAccount(a2);
//			accountDetails.addAccount(a3);
			
			a1.deposit(100000);
			a2.deposit(100000);
			
			System.out.println("balance after" + a1.getBalance());
			
			a3.withdrawl(100000);
			
		}
		catch(BankBalanceTooLowException e) {
			System.out.println(e);
		}
		catch(WithdrawlLimitExceededException e) {
			System.out.println(e);
		}
		catch(AccountAlreadyExistsException e) {
			System.out.println(e);
		}
		catch(DepositLimitExceededException e) {
			System.out.println(e);
		}
	}

}
