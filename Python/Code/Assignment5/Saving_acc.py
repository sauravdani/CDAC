'''
Create SavingsAccount as sub class of account - additional field (type - personal/corporate etc)
implement withdraw and deposit such that
- maximum upto 1 lakh can be deposited in an account at a time
- Min balance 5000 must be maintained while withdrawal (if type = corporate you withdraw full amount = balance)

'''
from Accout import Accout
from BalanceTooLowError import BalanceTooLow
from DepositAmountTooBigError import DepositAmountTooBigError
from WithdrawAmountTooBig import WithdrawAmountTooBig


class Saving_acc(Accout):

    def __init__(self, acc_id, name, balance, accType):
        super().__init__(acc_id, name, balance)
        self._accType = accType

    def deposite(self, amount):
        if amount <= 100000:
            self._balance += amount
            print("The amount deposited successfully")
        else:
            raise DepositAmountTooBigError("The amount is too big")

    def withdraw(self, amount):

        if amount > 100000:
            print("in if")
            raise WithdrawAmountTooBig("Can't withdraw more than 1L")
        elif amount > self._balance:
            print ("In elif")
            raise BalanceTooLow("Balance low")

        balanceAfterWithdraw = self._balance - amount
        print("Chencking account type")
        if self._accType != 'corporate':
            if balanceAfterWithdraw <= 5000:
                raise BalanceTooLow("you are not corporate account hence you have to maintain minimum 5000 balance")
            else:
                self._balance -= amount
                print("Withdraw successful from normal account")
                print("Current balance is: ", self._balance)
        else:
            self._balance -= amount
            print("Withdraw successful from corporate account")
            return self._balance







