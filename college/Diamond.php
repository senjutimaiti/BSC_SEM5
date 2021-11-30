<?php
$n=11;

if ($n%2===0):
    $k=(int)$n/2;
else:
    $k=(int)($n/2)+1;
endif;
for($i=$k; $i>=1; $i--)
{
    for($j=1; $j<=$n; $j++)
    {
        if($j === $i || $j === ($n+1-$i)):
            echo "*";
        else:
            echo " ";
        endif;
    }
    echo "\n";
}
for($i=2; $i<=$k; $i++)
{
    for($j=1; $j<=$n; $j++)
    {
        if($j === $i || $j === ($n+1-$i)):
            echo "*";
        else:
            echo " ";
        endif;
    }
    echo "\n";
}
?>