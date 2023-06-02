# RecorrerTablasSQL-PHP-JAVA

## Descripción
Pequeño programa con PHP y JAVA para poder recorrer e insertar filas con tan solo una acción.

- Con tan solo una acción inserta 100.000 filas en la base de datos seleccionada.

- Con tan solo otra acción puede recorrer todas estas filas, añadiendo en otra base de datos, el lenguaje correspondiente con el que se ha hecho la consulta, el dia y la hora en la que se ha hecho, y cuanto tiempo ha tardado.

## Contenido

- 2 Archivos PHP (InserirFiles.php y RecorrerFiles.php).
- Proyecto JAVA.
- Libreria sql para JAVA.
- 2 archivos sql para importar en vuestra DB.
- Foto de la consulta sql para saber la media de tiempo de cada lenguaje.
## Uso PHP

- Archivo InserirFiles.php: Inserta las 100.000 filas en la DB.
- Archivo RecorrerFiles.php: Recorre las filas e inserta en otra DB el tiempo transcurrido.

## Uso Java

- Importar Proyecto en vuestro IDE preferido. (Recomiendo IntelJ de JetBrains o Eclipse).
    - Clase Main.java: Recorre las filas e inserta en otra DB el tiempo transcurrido.
    - Clase InserirFiles.java: Inserta las 100.000 filas en la DB.
- Importar en el Proyecto la librería sql llamada "mysql-connector-j-8.0.33"

## Aspectos Básicos

Para que os funcione, debéis cambiar las siguientes variables, por vuestros datos de acceso y vuestra base de datos:

```php
$servername = "127.0.0.1"; <-- Conexión a vuestra DB
$username = "root"; <-- Usuario para acceder
$password = "P@ssword12"; <-- Contraseña de vuestro usuario
$dbname = "components"; <-- El nombre de vuestra base de datos
```



## Importar Proyecto en JetBrains
![AbrirProyectoJetBrains](readme/0602.gif)

## Importar Libreria en JetBrains
![ImportarLibreriaJetBrains](https://cdn.discordapp.com/attachments/718875492744298569/1114129552562716682/0602_1_.gif)

## Importar Proyecto en Eclipse
![AbrirProyectoEclipse](https://cdn.discordapp.com/attachments/718875492744298569/1114135532855890040/0602_2_.gif)

## Importar Libreria en Eclipse
![ImportarLibreriaEclipse](https://cdn.discordapp.com/attachments/718875492744298569/1114135533233373246/0602_3_.gif)

## Media

![Resultado](https://media.discordapp.net/attachments/718875492744298569/1114130865358909462/Sin_titulo-1.png)




## Support

Si necesitas ayuda, envíame un mensaje en discord **palaus#4531**.

