# Python Program explaining OOP 

class BankAccount:
    def __init__(self, initialAmount, acctName):
        self.balance = initialAmount
        self.name = acctName
        print(f"\nAccount '{self.name}' created.\nBalance = ${self.balance}")

Dave = BankAccount(1000, "Dave")
Sara = BankAccount(2000, "Sara")
