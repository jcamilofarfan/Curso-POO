<?php
require_once("Car.php");;
require_once("UberX.php");
require_once("Account.php");
require_once("UberPool.php");

$uberX = new UberX("ASD123",  new Account("Juan Farfan", "12456789"),  "Chevrolet", "Spark");
$uberX->printDataCar();

print "<br>";

$uberPool = new UberPool("ABC323",  new Account("Pedro Parque", "987654321"),  "Vmw", "2001");
$uberPool->printDataCar();

//driver->printDataAccount();


?>