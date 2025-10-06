'''
Create Bank App with Transaction class
Create Method withdraw_from_account(account : Account)  and deposit_to_account(account : Account)
These methods will return the new balance after deposite/withdraw

Creare user class with user interface that gives 2 menu options
1. Deposit
2. Withdraw

Both options will ask user to enter money to withdraw/deposite
Display a statement with each transaction and final balance after user exits from the menu


'''
from Accout import Accout
from BalanceTooLowError import BalanceTooLow
from DepositAmountTooBigError import DepositAmountTooBigError
from Saving_acc import Saving_acc
from WithdrawAmountTooBig import WithdrawAmountTooBig


class BankApp:
    accouts = []
    account1 = Saving_acc(1, "Max", 7000, 'normal')
    accouts.append(account1)
    account2 = Saving_acc(2, "Max1", 7000, 'corporate')
    accouts.append(account2)
    account3 = Saving_acc(3, "Max2", 70000, 'normal')
    accouts.append(account3)
    account4 = Saving_acc(4, "Max3", 70000, 'corporate')
    accouts.append(account4)
    account5 = Saving_acc(5, "Max", 7000, 'normal')
    accouts.append(account5)

    flag = True

    while flag:
        accid = int(input("Enter account ID: "))
        acc = account1
        for i in accouts:
            if i._acc_id == accid:
                acc = i
                break

        print("1.Withdraw")
        print("2.deposite")
        print("0.exit")
        ch = int(input("Enter 1 or 2: "))

        match ch:
            case 1:
                amount = int(input("Enter amount to withdraw: "))
                try:
                    acc.withdraw(amount)
                except WithdrawAmountTooBig as w:
                    print(w)
                except BalanceTooLow as w:
                    print(w)

            case 2:
                amount = int(input("Enter amount to deposite: "))
                try:
                    acc.deposite(amount)
                except DepositAmountTooBigError as d:
                    print(d)

            case 0:
                break
