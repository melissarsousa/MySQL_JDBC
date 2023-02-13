package MySQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Insert {

    public static void main(String[] args) throws SQLException {

        // Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pwd redacted");

        // Create a query
        Statement statement = (Statement) con.createStatement();

        String insert = "Insert into Student values(103,'Will')";

        // Execute the query
        statement.execute(insert);

        // Close the connection
        con.close();

        System.out.println("Query executed.");
    }

}