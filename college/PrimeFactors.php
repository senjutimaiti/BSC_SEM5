<?php
$a=35;
echo "Prime Factors are: ";
for($i=2; $i<=$a/2; $i++)
{
    if($a%$i === 0):
        $f=0;
        for($j=2; $i<=$i/2; $j++)
        {
            if($i%$j===0)
            $f++;
        }
        if($f===0):
            echo $i." ";
        endif;
    endif;
}
?>