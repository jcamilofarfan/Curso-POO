function Person(){}
Person.prototype.walk = function(){
    console.log("I am walking");
}
function Person (name){
    this.name = name;
}
var person = new Person("Juan");


class Person2{
    constructor(){
        this.name = "";
    }
    walk(){
        console.log("I am walking");
    }
}