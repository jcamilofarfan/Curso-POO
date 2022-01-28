from car import Car
from account import Account

if __name__ == '__main__':
    print("Hello World!")
    car = Car("ABC123", Account("Juan", "123.456.789-09"))
    print(vars(car))
    print(vars(car.driver))

