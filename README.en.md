# RecorrerTablasSQL-PHP-JAVA

## Description

Small program with PHP and JAVA to be able to browse and insert rows with just one action.

- With only one action it inserts 100.000 rows in the selected database.

- With just another action you can scroll through all these rows, adding in another database, the corresponding language with which the query has been done, the day and time it has been done, and how long it has taken.

## Content

- 2 PHP files (InserirFiles.php and RecorrerFiles.php).
- JAVA project.
- Sql library for JAVA.
- 2 sql files to import in your DB.
- Picture of the sql query to know the average time of each language.

## PHP use

- File InserirFiles.php: Inserts the 100,000 rows in the DB.
- File RecorrerFiles.php: Scrolls the rows and inserts in another DB the elapsed time.

## Java use

- Import Project in your preferred IDE (I recommend IntelJ from JetBrains or Eclipse).
  - Class Main.java: Runs through the rows and inserts in another DB the elapsed time.
  - Class InserirFiles.java: Inserts the 100.000 rows in the DB.
- Import in the Project the sql library called "mysql-connector-j-8.0.33".

## Basic Aspects

To make it work, you must change the following variables, for your access data and your database:

```php
$servername = "127.0.0.1"; <-- Connection to your DB
$username = "root"; <-- Login to access
$password = "P@ssword12"; <-- Your user's password
$dbname = "components"; <-- The name of your database
```

## Import Project into JetBrains

![AbrirProyectoJetBrains](readme/0602.gif)

## Import Library in JetBrains

![ImportarLibreriaJetBrains](https://cdn.discordapp.com/attachments/718875492744298569/1114129552562716682/0602_1_.gif)

## Import Project in Eclipse

![AbrirProyectoEclipse](https://cdn.discordapp.com/attachments/718875492744298569/1114135532855890040/0602_2_.gif)

## Import Library in Eclipse

![ImportarLibreriaEclipse](https://cdn.discordapp.com/attachments/718875492744298569/1114135533233373246/0602_3_.gif)

## Media

![Resultado](https://media.discordapp.net/attachments/718875492744298569/1114130865358909462/Sin_titulo-1.png)

## Support

If you need help, send me a message in discord **palaus#4531**.
