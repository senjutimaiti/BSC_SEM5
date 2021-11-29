<html>
    <body>

        <form action = "<?php $_PHP_SELF; ?>" method ="POST">
            NAME: <input type = "text" name = "n" />
            EMAIL: <input type = "text" name = "e" />
            <input type="submit" />
        </form>
    </body>
</html>

<?php
    if( isset($_POST["n"]) || isset($_POST["e"]) )
    {
        echo "Welcome". $_POST["n"]."!";
        echo "Your email address is ".$_POST["e"];
    }
    exit();
?>