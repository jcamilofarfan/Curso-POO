class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberx = new UberX("ABC-123", new Account("Juan", "123.456.789-10"), "Chevrolet", "Spark");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("DEF-456", new Account("Pedro", "987.654.321-10"));
        ubervan.setPassenger(6);
        ubervan.printDataCar();
        
        // Car car2 = new Car("DEF-456", new Account("Pedro", "987.654.321-09"));
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}