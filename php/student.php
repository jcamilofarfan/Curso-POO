<?php
    require_once "./person.php";

    class Student extends Person{
      //  $studentNumber = "";
        function presentation(){
            echo "Hi, my name is " . $this->name . " and my student number is " . $this->studentNumber;
        }
    }
    public function __construct($name,){
        parent::__construct($name);
    }
    $student100 = new Student("Juan", "100");

    $student100->presentation();


