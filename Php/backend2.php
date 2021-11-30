<?php
    $usn = $_POST["usrnm"];
    $npswd = $_POST["npwd"];

    if(!empty($usn))
    {
        if(!empty($npswd))
        {
            $usr ="root";
            $pswd ="";
            $dbname ="feedback";

            $connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot Connect");
            echo "Connection successful<br>";
            $sql = "UPDATE `validity` SET `name`='$usn',`password`='$npswd'";
            if($connect->query($sql) == TRUE)
            {
                echo "Password changed successfully";
            }
            else
            {
                echo "Not successful"."<br>".$connect->error;
            }
        }
        else
        {
            echo "New Password cannot be empty";
            die();
        }
    }
    else
    {
        echo "Username cannot be empty";
        die();
    }
?>