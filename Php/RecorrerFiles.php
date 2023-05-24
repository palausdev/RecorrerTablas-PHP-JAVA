<?php
$servername = "127.0.0.1";
$username = "root";
$password = "P@ssword12";
$dbname = "components";
$sql = "SELECT * FROM filas";
$php = "php";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Error de connexió a la base de dades: " . $conn->connect_error);
}

$tempsInici = microtime(true);

$data = date("Y-m-d H:i:s");
//echo $data;

//echo $sql;

// Executar la consulta SQL 
$files = $conn->query($sql);

$cont = 1;
while ($row = mysqli_fetch_array($files, MYSQLI_NUM)) {
    echo "<br>";
    echo "Fila $cont: $row[0]";

    ++$cont;
}

$tempsFinal = microtime(true);
$tempsTotal = $tempsFinal - $tempsInici;

echo "<br>";
echo "<br>";
echo "Temps tardat: " . $tempsTotal . " segons";

$sqlTemps = "INSERT INTO components(Llenguatge, Data, Temps) VALUES ('$php','$data','$tempsTotal')";

//echo $sqlTemps;
echo "<br>";
echo "<br>";

if ($conn->query($sqlTemps) === TRUE) {
    echo "Logs registrats a la taula components";
} else {
    echo "Error a la consulta: " . $conn->error;
}

$conn->close();
