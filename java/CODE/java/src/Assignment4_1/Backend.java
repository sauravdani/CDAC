package Assignment4_1;

import java.util.ArrayList;

public class Backend {
	ArrayList<Account> accountList;
	
	public Backend() {
		accountList = new ArrayList<Account>();
	}
	
	public void addAccount(Account acc) throws AccountAlreadyExistsException{
//		System.out.println("In addAcc");
		for (Account a:accountList) {
//			System.out.println("In for");
			if (a.equals(acc)) {
				throw new AccountAlreadyExistsException("The account already exists, try adding new account with different account id");
			}
		}
		accountList.add(acc);
//		System.out.println("Acc added");
	}
}
