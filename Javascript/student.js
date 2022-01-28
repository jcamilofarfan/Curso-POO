function Student(){}

Student.prototype = new Person();



class Student extends Person2{
    constructor(name){
        super(name);
        this.studentNumber = studentNumber;
    }
}