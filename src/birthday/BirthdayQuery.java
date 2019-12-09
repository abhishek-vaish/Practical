package birthday;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BirthdayQuery {
    ResultSet resultSet = null;

    public ResultSet getQuery(Connection connection) {
        ResultSet resultSet = null;
        String Query = "SELECT * FROM birthday;";
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(Query);
        } catch (SQLException e) {
            System.out.println("Exception Occurred!!!");
        }
        return resultSet;
    }
}
