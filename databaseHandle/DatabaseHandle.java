// package DatabaseHandle;

import java.sql.Connection; // Represent a connection to a database
import java.sql.DriverManager; // DriverManager is a class that manages a set of JDBC drivers
import java.sql.SQLException; // SQLException is a subclass of Exception that indicates that a database access error has occurred
import java.sql.ResultSet; // ResultSet is a subclass of java.sql.ResultSet that represents the result of executing a query
import java.sql.Statement; // Statement is a subclass of java.sql.Statement that represents a database query

public class DatabaseHandle {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            String user = "root";
            String password = ""; // password is empty
            String dbname = "company";
            String url = "jdbc:mysql://localhost:3306/" + dbname;
	    // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");

            // Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM employee";
            ResultSet output = stmt.executeQuery(sql); // executeQuery returns a ResultSet object
            
            while (output.next()) {
                System.out.println(output.getString("emp_name") + " " + output.getString("city"));
            }
        } catch (SQLException e) {
            throw new Error("Problem connecting to the database", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new Error("Problem closing the connection" + e.getMessage());
            }
        }
    }
}