<html>
    <body>
        <form action = "<?php $_PHP_SELF; ?>" method ="POST">
            NAME: <input type = "text" name = "txtbox" />
            AGE: <input type = "text" name = "age" />
            <input type="submit" />
        </form>
    </body>
</html>

<?php
    if( isset($_POST["txtbox"]) || isset($_POST["age"]) ){
        echo "<br />Welcome ". $_POST["txtbox"]."<br />";
        echo "You are ". $_POST["age"]." years old.";
    }

    exit();
?>