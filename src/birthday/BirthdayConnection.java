package birthday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BirthdayConnection {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/records";
    Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public boolean closedConnection() {
        boolean Status = false;
        if (getConnection() != null) {
            System.out.println("Connection Closed");
            Status = true;
        }
        return Status;
    }

    public boolean createConnection(Connection connection) {
        boolean CreateConnection = false;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Created Successfully");
            CreateConnection = true;
        } catch (SQLException e) {
            System.out.println("Exception Occurred!!!");
        }
        return CreateConnection;
    }
}
