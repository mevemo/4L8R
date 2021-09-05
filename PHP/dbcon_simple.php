<?php

#---- Vorbereitung ---------------------------------
    $dbserver = "localhost";
    $dbuser = "root";
    $dbpassword = "";
    $db = "lf10"; 

#----- Verbindungsobjekt ---------------------------
    #$con = mysqli_connect($dbserver,$dbuser, $dbpassword, $db); // mysqli sowohl für prozedurales als auch OO-PHP einzusetzen, PDO hingegen nur für OO-PHP geeignet!
    $con = new mysqli($dbserver,$dbuser, $dbpassword, $db);

#----- SQL Anweisung ---------------------------
    $sql = "SELECT * FROM lf10_tn ORDER BY Vorname ASC"; // ASC oder DEC

#----- Aufruf des Verbindungsobjekts mit ---------------    
    $result = $con->query($sql);  //wichtigste Zeile für Daten!

    ?>