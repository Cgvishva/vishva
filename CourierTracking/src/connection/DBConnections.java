package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnections {
    private static final String URL = "jdbc:postgresql://localhost:5432/CourierTracking";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Vishva@2008";

    public static Connection getConnection() {
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
}
