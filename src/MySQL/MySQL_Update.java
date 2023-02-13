package MySQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Update {

    public static void main(String[] args) throws SQLException {

        // Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pwd redacted");

        // Create a query
        Statement statement = (Statement) con.createStatement();

        String update = "update Student set Student_Name='Leoncio' where Student_id=103";

        // Execute the query
        statement.execute(update);

        // Close the connection
        con.close();

        System.out.println("Query executed.");
    }

}