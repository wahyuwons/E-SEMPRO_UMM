<?php
// Check if nim and password are set
if(isset($_POST['nim']) && isset($_POST['password'])){
    // Include the necessary files
    require_once "conn.php";
    require_once "validate.php";
    // Call validate, pass form data as parameter and store the returned value
    $nim = validate($_POST['nim']);
    $password = validate($_POST['password']);
    // Create the SQL query string
    $sql = "select * from users where nim='$nim' and password='" . md5($password) . "'";
    // Execute the query
    $result = $conn->query($sql);
    // If number of rows returned is greater than 0 (that is, if the record is found), we'll print "success", otherwise "failure"
    if($result->num_rows > 0){
        echo "success";
    } else{
        // If no record is found, print "failure"
        echo "failure";
    }
}
?>