<?php
    $data = getDate();
    $hour = $data["hours"];
    $day = $data["mday"];
    $month = $data["mon"];
    $year = $data["year"];
    if($day < 10){
        $day = "0" . $day;
    } 
    if($month < 10){
        $month = "0" . $month;
    }
    echo "Biezaca data to:".$day.$month.$year;
?>