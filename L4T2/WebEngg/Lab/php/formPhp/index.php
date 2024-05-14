<?php

$con = mysql_connect('localhost', '', 'root');

if(!$con) {
    echo " Server Not Connected ";
}

if(!mysql_select_db($con, 'contact')) {
    echo " Database Not Connceted ";
}

$name = $_POST['username'];
$email = $_POST['email'];

$sql = "INSERT INTO userinfo(userName, userEmail) VALUES('$name', '$email')";

if(!mysql_query($con, $sql)) {
    echo "Something Went Wrong to insert the data";
}
else {
    echo " Saved the Data";
}
?>