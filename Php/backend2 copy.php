<?php
    $usn = $_POST["usrnm"];
    $cpswd = $_POST["cpwd"];
    $npswd = $_POST["npwd"];

    if(!empty($usn) && !empty($cpswd) && !empty($npswd))
    {
        $usr ="root";
        $pswd ="";
        $dbname ="assignment4";

        $connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot Connect");
        //echo "Connection successful<br>";
        $sql="select * from student where (`student_id`='$usn')";
        $result = mysqli_query($connect, $sql);
        if(mysqli_num_rows($result)>0)
        {
            $row = mysqli_fetch_array($result);
            if($cpswd == $row['password'])
            {
                $sql = "UPDATE `student` SET `password`='$npswd' WHERE `student_id`='$usn' AND `password`='$cpswd'";
                if ($connect->query($sql) == TRUE)
                {
                    echo "Updated password";
                }
                else
                {
                    echo "Not successful"."<br>".$connect->error;
                }
            }
            else
            {
                echo "Wrong current password";
                die();
            }
            mysqli_free_result($result);
        }
        else{
            echo "Student Id does not exist";
        }
    }
    else
    {
        echo "Everything must be filled";
        die();
    }
?>