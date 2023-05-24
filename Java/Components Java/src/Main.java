import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String servername = "127.0.0.1";
        String username = "root";
        String password = "P@ssword12";
        String dbname = "components";

        String url = "jdbc:mysql://" + servername + "/" + dbname;

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn == null) {
                System.out.println("Error de conexió a la base de dades.");
                return;
            }

            String Lenguatge = "Java";

            String Data = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

            long Temps = System.currentTimeMillis();

            String sql = "SELECT * FROM filas";
            Statement statement = conn.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                do {
                    int valor = resultado.getInt("Valor");
                    int random = resultado.getInt("Random");
                    System.out.println("Valor: " + valor + " - Random: " + random);
                } while (resultado.next());
            } else {
                System.out.println("No s'han trobat resultats a la taula filas.");
            }

            long tiempoFin = System.currentTimeMillis();
            double tiempoEjecucion = (tiempoFin - Temps) / 1000.0;

            sql = "INSERT INTO components(Llenguatge, Data, Temps) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Lenguatge);
            preparedStatement.setString(2, Data);
            preparedStatement.setDouble(3, tiempoEjecucion);
            preparedStatement.executeUpdate();

            System.out.println("Llenguatge: " + Lenguatge);
            System.out.println("Data actual: " + Data);
            System.out.println("Temps: " + Temps + " segons");

        } catch (SQLException e) {
            System.out.println("Error al executar la consulta: " + e.getMessage());
        }
    }
}