<?php
    class Person{
        $name = "";
        function walk(){
            echo "I am walking";
        }
    }
    public function __construct($name){
        $this->name = $name;
    }
    $person = new Person("Juan");