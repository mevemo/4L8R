<?php
    
    #---- Vorbereitung ---------------------------------
    $dbserver = "localhost";
    $dbuser = "root";
    $dbpassword = "";
    $db = "lf10"; 

    #----- Verbindungsobjekt ---------------------------
    #$con = mysqli_connect($dbserver,$dbuser, $dbpassword, $db); // mysqli sowohl für prozedurales als auch OO-PHP einzusetzen, PDO hingegen nur für OO-PHP geeignet!
    $con = new mysqli($dbserver,$dbuser, $dbpassword, $db); // objektorientiert wie PDO
    #print_r($con->connect_error);

    if ($con->connect_errno) {  // -> wenn connect_errno = true bzw. > 0 (also fehlerhafte Verbindung) 
        die("<h3>Verbindung fehlgeschlagen: ".$con->connect_error."</h3>"); //Hinweis oder Fehlermeldung ausgeben, falls Verbindung zur DB nicht möglich

    }
    else {
        echo "<p><h4>Verbindung zur Datenbank ".$db." erfolgreich aufgebaut! </h4></p><br><br>"; 
        $con->set_charset('utf8'); //wegen Umlaute äöü! //
        #-------
        echo date("l d.M.Y  H:i:s"); 
        echo "<hr>"; 
    } 
    #--- Daten aus DB abrufen:  -------------------------

    $sql = "SELECT * FROM lf10_tn ORDER BY Vorname ASC"; // ASC oder DEC
    $result = $con->query($sql);  //wichtigste Zeile für Daten!
    
    //print_r($result);  //Test für num_rows > 0 
     
    if ($result->num_rows > 0) {
        echo "<h4>Anzahl der Datensätze in Tabelle: ".$result->num_rows."</h4>"; 
        echo "<br><br>";

        echo "Ausgabe der Datensätze: <br>"; //verschiedene Varianten! 
        #$record = $result->fetch_assoc(); //nur 1 Datensatz wird ausgelesen! 
        #$record = $result->fetch_all(); // alle Datensätze, aber Array ist nun nummerisch!
        $record = $result->fetch_all(MYSQLI_ASSOC); // mit Parameter MYSQLI_ASSOC: assoziatives Array! 
       
        #Variante 1 (foreach):
        foreach($record as $row) {
            echo '<br>';
            echo '<br><table><th>'.$row['Vorname']." ".$row['Nachname'].'</th></table>';
            echo '<hr>';
        }
    
        #Variante 2 (while):
        /*
        while ($row = $result->fetch_object()) { //objektorientiert im Vergleich zu "fetch_assoc()"
            echo $row->Nachname.'<br>'; 
        }
        */
        
        #Variante 3 (Ausgabe als Array): 
        /*
        echo '<pre>';
        print_r($record); 
        echo '</pre>';
        */
    
    }

    $result->free(); 
    $con->close(); 


    


?>