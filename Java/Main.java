class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("ABC-123", new Account("Juan", "123.456.789-10"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("DEF-456", new Account("Pedro", "987.654.321-09"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}