package MySQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL_Select {

    public static void main(String[] args) throws SQLException {

        // Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pwd redacted");

        // Create a query
        Statement statement = (Statement) con.createStatement();

        String select = "select * from Student";

        // Execute the query and store data in result set
        ResultSet resultSet=statement.executeQuery(select);

        while(resultSet.next()){
            int studentId = resultSet.getInt(1);
            String studentName = resultSet.getString(2);

            System.out.println(studentId + "....." + studentName);
        }
        // Close the connection
        con.close();
    }
}
