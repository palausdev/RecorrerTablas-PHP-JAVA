<?php
$servername = "127.0.0.1";
$username = "root";
$password = "P@ssword12";
$dbname = "components";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Error de conexión a la base de datos: " . $conn->connect_error);
}

$values = "";

for ($i = 1; $i <= 100000; $i++) {
    // Generar un valor aleatori entre 1 y 999 
    $valor = rand(1, 999);
    // Generar un valor aleatori entre 1 y 999 
    $random = rand(1, 999);
    //Agregar els valors generats al string $values, separant-los per comes i ficant-los entre parentesis
    $values .= "($valor, $random),";
}

// Eliminar la ultima coma del string $values 
$values = rtrim($values, ",");

$sql = "INSERT INTO filas(Valor, Random) VALUES $values";

// Executar la consulta SQL 
if ($conn->query($sql) === TRUE) {
    echo "Insertades 100,000 files en a la taula files.";
} else {
    echo "Error a la consulta: " . $conn->error;
}

// Cerrar la conexión a la base de datos
$conn->close();
