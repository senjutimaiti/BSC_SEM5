<?php

$usr ="root";
$pswd ="";
$dbname ="feedback";

$connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot Connect");
echo "Connection successful";

?>