<?php
	$a=2;
	$b = &$a;
	$b="3$b";
	echo '$b is = '.$b;
	echo '<br> $a is = '.$a;
?>
	
