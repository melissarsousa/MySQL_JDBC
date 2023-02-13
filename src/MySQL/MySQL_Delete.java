package MySQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Delete {

    public static void main(String[] args) throws SQLException {

        // Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pwd redacted");

        // Create a query
        Statement statement = (Statement) con.createStatement();

        //String insert = "Insert into Student values(103,'Will')";

        String delete = "delete from Student where Student_id=103";

        // Execute the query

        //statement.execute(insert);
        statement.execute(delete);

        // Close the connection
        con.close();

        System.out.println("Query executed.");
    }

}