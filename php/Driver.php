<?php
require_once("./Account.php")
class Driver extends Account{
    public $name;
    public $document;

    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
    public function printDataDriver(){
        echo "Driver: $this->name, Document: $this->document";
    }
}