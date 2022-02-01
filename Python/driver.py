from account import Account
class Driver(Account):
    name = str
    document = str

    def __init__(self, name, document):
        super().__init__(name, document)