<?php  
    $marks=64;      
    if ($marks>=0 && $marks<33){    
        echo "fail";    
    }    
    else if ($marks>=33 && $marks<=44) {    
        echo "Third Division";    
    }    
    else if ($marks>=45 && $marks<=59) {    
       echo "Second Division";   
    }    
    else if ($marks>=60 && $marks<100) {    
        echo "First Division";   
    }  
   else {    
        echo "Invalid input";    
    }    
?>  