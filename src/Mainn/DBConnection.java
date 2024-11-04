package Mainn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "Habibi";
    private static final String PASSWORD = "umar2906";
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver"); // Load Oracle JDBC driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
