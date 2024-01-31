# Python Program explaining OOP 

# initialize BankAccount object
class BankAccount:
    def __init__(self, initialAmount, acctName):
        self.balance = initialAmount
        self.name = acctName
        print(f"\nCustomer accounts created.\nAccount Name: {self.name}\nBalance = ${self.balance:.2f}")

# initialize instances of BankAccount object      
customer_BankAccount1 = BankAccount(1000, "David")
customer_BankAccount1 = BankAccount(2000, "Shari")

