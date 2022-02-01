<?php
    class Account{
        public $name ;
        public $document ;

        public function __construct($name, $document){
            $this->name = $name ;
            $this->document = $document;
        }
        public function printDataAccount(){
            echo "Driver: $this->name, Document: $this->document";
        }
    }