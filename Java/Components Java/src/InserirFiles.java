import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirFiles {
    public static void main(String[] args) {
        // Establecer los parámetros de conexión a la base de datos
        String servername = "127.0.0.1";
        String username = "root";
        String password = "P@ssword12";
        String dbname = "components";

        String url = "jdbc:mysql://" + servername + ":" + "/" + dbname;

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Statement statement = conn.createStatement();

            StringBuilder values = new StringBuilder();
            for (int i = 1; i <= 100000; i++) {
                int valor = (int) (Math.random() * 999) + 1;
                int random = (int) (Math.random() * 999) + 1;
                values.append("(").append(valor).append(", ").append(random).append("),");
            }

            values.deleteCharAt(values.length() - 1);

            String sql = "INSERT INTO filas(Valor, Random) VALUES " + values;

            statement.executeUpdate(sql);

            System.out.println("S'han insertat 100,000 files a la taula filas.");

        } catch (SQLException e) {
            System.out.println("Error a l'executar la consulta: " + e.getMessage());
        }
    }
}
