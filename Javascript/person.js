function Person(){

}
Person.prototype.walk = function(){
    console.log("I am walking");
}

class Person2{
    constructor(){
        this.name = "";
    }
    walk(){
        console.log("I am walking");
    }
}