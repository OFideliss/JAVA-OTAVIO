import java.sql.*;
import java.sql.Connection;

public class ConnectionFactory {
    // Atributos da conexão
    private static final String url = "jdbc:postgresql://localhost:5432/postgres"; // URL de conexão com o banco de
                                                                                   // dados PostgreSQL.
    private static final String user = "postgres"; // Nome de usuário do banco de dados.
    private static final String pass = "postgres"; // Senha do banco de dados.

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
