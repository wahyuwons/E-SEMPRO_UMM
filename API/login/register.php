<?php
if(isset($_POST['nim']) && isset($_POST['password']) && isset($_POST['name'])){
    // Include the necessary files
    require_once "conn.php";
    require_once "validate.php";
    // Call validate, pass form data as parameter and store the returned value
    $nim = validate($_POST['nim']);
    $password = validate($_POST['password']);
    $name = validate($_POST['name']);
    // Create the SQL query string. We'll use md5() function for data security. It calculates and returns the MD5 hash of a string
    $sql = "insert into users values('','$nim', '" . md5($password) . "','$name')";
    // Execute the query. Print "success" on a successful execution, otherwise "failure".
    if(!$conn->query($sql)){
        echo "failure";
    }else{
        echo "success";   
    }
}
?>