'''
Create CurrentAccount as sub class of account
implement withdraw and deposit such that
- maximum upto 2 lakh can be deposited in an account at a time
- Min balance 10000 must be maintained while withdrawal
'''

from abc import ABC

from Accout import Accout
from BalanceTooLowError import BalanceTooLow
from DepositAmountTooBigError import DepositAmountTooBigError
from WithdrawAmountTooBig import WithdrawAmountTooBig


class CurrentAccount(Accout):

    def __init__(self, acc_id, name, balance, accType):
        super().__init__(acc_id, name, balance)

    def deposite(self, amount):
        if amount <= 200000:
            self._balance += amount
            print("The amount deposited successfully")
        else:
            raise DepositAmountTooBigError("The amount is too big")

    def withdraw(self, amount, accType):

        # if amount > 100000:
        #     raise WithdrawAmountTooBig("Can't withdraw more than 1L")
        if amount > self._balance:
            raise BalanceTooLow("Balance low")

        balanceAfterWithdraw = self._balance - amount

        if balanceAfterWithdraw <= 10000:
            self._balance -= amount
            return self._balance
