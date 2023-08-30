package labwork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/stddb", "root", "1234");
            System.out.println("Connection is created successfully:");

            stmt = conn.createStatement();
            String query1 = "INSERT INTO student (name, roll, address,grade) " +
                            "VALUES ('Mina', '2', 'Kathmandu','B')";
            stmt.executeUpdate(query1);

//            query1 = "INSERT INTO employee (name, email, address) " +
//                     "VALUES ('Roshina', 'rosh@gmail.com', 'Los Angeles')";
//            stmt.executeUpdate(query1);

            System.out.println("Records are inserted into the table successfully.");
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
        System.out.println("Please check the data in the MySQL table.");
    }
}


