<?php
$a = 90;
$b = 11;
$c = "Divide";
$result = 0;

switch ($c)
{
	case "Add":{
            $result = $a + $b;
            echo $result;
        }break;
	case "Subtract":{
	        $result = $a - $b;
            echo $result;
        }break;
	case "Multiply":{
            $result = $a * $b;
            echo $result;
        }break;
	case "Divide":
        {
            if ($b<>0):
		        $result = $a / $b;
                echo $result;
            else:
                echo "Division not possible";
            endif;
        }break;
    default: echo "Wrong choice";
}
