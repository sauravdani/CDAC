'''
Q.2 Create an Account class Heirarchy
Account with super class (acc_id, name, balance)
methods - withdraw and deposit

'''

from abc import ABC, abstractmethod


class Accout(ABC):
    def __init__(self, acc_id, name, balance):
        self._acc_id = acc_id
        self._name = name
        self._balance = balance

    @abstractmethod
    def withdraw(self, amount):
        pass

    @abstractmethod
    def deposite(self, amount):
        pass

    def __str__(self):
        return f'AccountID: {self._acc_id} Name: {self._name}, balance: {self._balance}'
