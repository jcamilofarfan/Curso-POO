class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        car.license = "ABC123";
        car.driver = "Juan Farfan";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "XYZ456";
        car2.driver = "Pedro Parquer";
        car2.passenger = 3;
        car2.printDataCar();
    }
}