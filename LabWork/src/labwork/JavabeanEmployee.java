package labwork;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavabeanEmployee implements Serializable {
    private int id;
    private String name;
    private String email;
    private String address;

    public JavabeanEmployee() {
    }

    public void setEmail(String email) {
        this.email = email;
        // Fetch employee information from the database based on the provided email address
        fetchEmployeeData();
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void fetchEmployeeData() {
        String url = "jdbc:mysql://localhost:3307/empdb";
        String username = "root";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM employee WHERE email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getInt("id");//column id
                name = resultSet.getString("name");
                address = resultSet.getString("address");
            } else {
                // Reset the properties if no matching employee found
                id = 0;
                name = null;
                address = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JavabeanEmployee employeeBean = new JavabeanEmployee();
        employeeBean.setEmail("anish@gmail.com");

        // Display employee information
        System.out.println("Employee Information:");
        System.out.println("ID: " + employeeBean.getId());
        System.out.println("Name: " + employeeBean.getName());
        System.out.println("Email: " + employeeBean.getEmail());
        System.out.println("Address: " + employeeBean.getAddress());
    }
}



