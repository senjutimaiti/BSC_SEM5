<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>
</head>
<body style="text-align: center; background-color: rgb(217, 237, 247)">
<h3 style="text-align: center;color: rgb(124, 91, 7); font-size: 35px">Student Information</h3>
<?php
    $username = $_POST["uname"];
    $password = $_POST["pwd"];

    if(!empty($username) && !empty($password))
    {
        $usr ="sayan";
        $pswd ="";
        $dbname ="assignment4";

        $connect = new mysqli("localhost",$usr,$pswd,$dbname);
        if($connect -> connect_errno)
        {
            echo "Error connecting to feedback";
        }
        else
        {
            //echo "Connection successful<br>";
            $sql = "SELECT * FROM `student` WHERE `student_id`='$username' AND `password`='$password'";

            if($result = mysqli_query($connect, $sql))
            {
                if(mysqli_num_rows($result)>0)
                {
                    $row = mysqli_fetch_array($result);
                    echo "<table border='3' style='width: 100%;text-align: center; font-size: 25px'>";
                    echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>Name</td>";
                        echo "<td>".$row['name']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>Student Id</td>";
                        echo "<td>".$row['student_id']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>Semester</td>";
                        echo "<td>".$row['sem']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>CC8</td>";
                        echo "<td>".$row['cc8']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>CC9</td>";
                        echo "<td>".$row['cc9']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>CC10</td>";
                        echo "<td>".$row['cc10']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>SEC-B</td>";
                        echo "<td>".$row['sec_B']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>Total</td>";
                        echo "<td>".$row['total']."</td>";
                        echo "</tr>";
                        echo "<tr style='height: 35px'>";
                        echo "<td style='background-color: rgb(228, 233, 222)'>Status</td>";
                        echo "<td>".$row['status']."</td>";
                        echo "</tr>";
                    echo "</table>";
                }
                else
                {
                    echo "Wrong information";
                    die();
                }
                mysqli_free_result($result);
            }
        }
    }
    else
    {
        echo "Everything must be filled";
        die();
    }
?>