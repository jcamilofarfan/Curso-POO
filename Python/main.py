from car import Car

if __name__ == '__main__':
    car = Car()
    car.license = "ABC123"
    car.driver = "Juan"
    print(vars(car))

    car2 = Car()
    car2.license = "DEF456"
    car2.driver = "Pedro"
    print(vars(car2))

