<?php
    $con = mysqli_connect("localhost", "root", "") or 
    die ("cann't access to data base".mysql_error());

    mysqli_select_db($con, "db_inbook");
    mysqli_query($con, "SET NAMES 'utf8'");
?>