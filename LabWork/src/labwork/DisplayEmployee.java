import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/empdb";
        String username = "root";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM employee";
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Employee Data:");
            System.out.println("------------------------------------------");
            System.out.println("ID\tName\t\tEmail\t\t\tAddress");
            System.out.println("------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                System.out.printf("%d\t%s\t%s\t%s%n", id, name, email, address);
            }

            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
