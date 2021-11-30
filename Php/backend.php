<?php
    $username = $_POST["uname"];
    $password = $_POST["pwd"];

    if(!empty($username))
    {
        if(!empty($password))
        {
            $usr ="root";
            $pswd ="";
            $dbname ="feedback";

            $connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot Connect");
            echo "Connection successful<br>";
            $sql = "INSERT INTO `validity`(`name`,`password`) VALUES ('$username','$password')";
            if($connect->query($sql) == TRUE)
            {
                echo "New member added";
            }
            else
            {
                echo "Not successful"."<br>".$connect->error;
            }
        }
        else
        {
            echo "Password cannot be empty";
            die();
        }
    }
    else
    {
        echo "Username cannot be empty";
        die();
    }
?>