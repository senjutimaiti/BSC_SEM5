<?php

$usr ="root";
$pswd ="";
$dbname ="feedback";

$connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot Connect");
echo "Connection successful";
echo "<br><br><br>";
$sql = "SELECT * FROM `test`;";
if($result = mysqli_query($connect, $sql))
{
    if(mysqli_num_rows($result)>0)
    {
        while($row = mysqli_fetch_array($result))
        {
            echo "Name: ".$row['name']."<br>";
            echo "Department: ".$row['dept']."<br>";
            echo "Address: ".$row['address']."<br>";
            echo "City: ".$row['city']."<br><br><br><br>";
        }
    }
    mysqli_free_result($result);
}

/*
$sql = "INSERT INTO `test`(`name`,`dept`,`address`,`city`) VALUES ('Bismay','CMSA','Dumdum','Kolkata')";
if($connect->query($sql) == TRUE)
{
    echo "Insertion done successfully";
}
else
{
    echo "Not successful"."<br>".$connect->error;
}
*/

mysqli_close($connect);
?>