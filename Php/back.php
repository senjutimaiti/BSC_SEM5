<?php
    $username = $_POST["usrname"];
    $password = $_POST["pwd"];
    $student_Id = $_POST["sid"];
    $mobile = $_POST["mobile"];
    $semester = $_POST["sem"];
    $cc8 = $_POST["cc8"];
    $cc9 = $_POST["cc9"];
    $cc10 = $_POST["cc10"];
    $sec_B = $_POST["sec"];
    $total = $cc8+$cc9+$cc10+$sec_B;
    $status = $_POST["status"];

    if(!empty($username) && !empty($password) && !empty($student_Id) && !empty($mobile) && !empty($semester) && !empty($cc8) && !empty($cc9) && !empty($cc10) && !empty($sec_B) && !empty($status))
    {
        $usr = "root";
        $pswd = "";
        $dbname = "assignment4";
        $connect = new mysqli("localhost",$usr,$pswd,$dbname) or die("Cannot connect");
        $sql = "INSERT INTO `student`(`name`, `password`, `student_id`, `mobile`, `sem`, `cc8`, `cc9`, `cc10`, `sec_B`, `total`, `status`) VALUES ('$username','$password','$student_Id','$mobile','$semester','$cc8','$cc9','$cc10','$sec_B','$total','$status')";
        if ($connect->query($sql) == TRUE)
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
        echo "Everything must be filled";
        die();
    }
?>