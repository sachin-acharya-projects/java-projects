// package databaseHandle_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

// Public class DatabaseHandle
public class DatabaseHandle {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            String user = "root";
            String password = ""; // password is empty
            String dbname = "company";
            String url = "jdbc:mysql://localhost:3306/" + dbname;
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet result = null;
            // Creating table: assignment
            String sql = "CREATE TABLE assignment("
                        + "ID INT PRIMARY KEY AUTO_INCREMENT, "
                        + "name varchar(50), "
                        + "address varchar(50), "
                        + "gender varchar(6), "
                        + "DOBS int(4)"
                        + ")";
            int i = 0;
            // i = stmt.executeUpdate(sql);
            // System.out.println("Query has returned with statue " + i);
            
            sql = "INSERT INTO assignment values "
            + "(null, \"Albert Acharya\", \"Bharatpur\", \"male\", \"2000\")";
            i = stmt.executeUpdate(sql);
            System.out.println("Query has returned with statue " + i);

            sql = "SELECT * FROM assignment WHERE DOBS >= 2000";
            result = stmt.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getString("name")
                + result.getString("address")
                + result.getString("gender")
                + result.getString("DOBS"));
            }
        } catch (SQLException e) {
            throw new Error("Problem Occured", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch(SQLException e) {
                System.out.println("Problem Occured while closing connection\n" + e.getMessage());
            }
        }
    }
}