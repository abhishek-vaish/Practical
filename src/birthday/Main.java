package birthday;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BirthdayConnection birthdayConnection = new BirthdayConnection();
        BirthdayQuery birthdayQuery = new BirthdayQuery();
        birthdayConnection.createConnection(birthdayConnection.getConnection());
        ResultSet birthdayDate = birthdayQuery.getQuery(birthdayConnection.getConnection());
        while (true) {
            try {
                if (!birthdayDate.next()) {
                    break;
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            try {
                System.out.println("NAME : " + birthdayDate.getString("sname"));
                System.out.print("DATE : " + birthdayDate.getDate("birthday"));
            } catch (SQLException e) {
                System.out.println("Exception Occurred!!!");
            }
        }
    }
}
