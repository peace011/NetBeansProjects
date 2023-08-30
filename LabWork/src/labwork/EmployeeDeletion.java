/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;
  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Dell
 */
public class EmployeeDeletion {
  

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/empdb", "root", "1234");
            System.out.println("Connection is created successfully:");

            stmt = conn.createStatement();

            // Specify the condition to delete the row(s) (e.g., employees with name 'Carol')
            String deleteQuery = "DELETE FROM employee WHERE name = 'Roshina'";
            int rowsAffected = stmt.executeUpdate(deleteQuery);

            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " row(s) deleted from the table.");
            } else {
                System.out.println("No matching rows found for deletion.");
            }
        } catch (ClassNotFoundException | SQLException excep) {
            excep.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Deletion process completed.");
    }
}

