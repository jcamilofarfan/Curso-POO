class Person{
    String name = "";
    void walk(){
        System.out.println("I am walking");
    }

    public Person(String name){
        this.name = name;
    }

    Person p = new Person("Juan");
}