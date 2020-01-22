import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection 
public class DatabaseConnection {
    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding 
        // Database Connection
        String dbURL = "jdbc:mysql://localhost:3306/";
        // Database name to access 
        String dbName = "ihm?serverTimezone=UTC";
        String dbUsername = "root";
        String dbPassword = "1234";

        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
        return con;
    }
} 