<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        <h2>Student Details</h2>
        <table border="1">
            <tr>
                <th>Name</th>
                <th>Roll</th>
                <th>Address</th>
                <th>Grade</th>
            </tr>
       
                
            <% 
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String jdbcUrl = "jdbc:mysql://localhost:3307/stddb";
                    String username = "root";
                    String password = "1234";

                    Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                    Statement statement = connection.createStatement();
                    String sql = "SELECT name, roll, address, grade FROM student";
                    ResultSet resultSet = statement.executeQuery(sql);

                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        int roll = resultSet.getInt("roll");
                        String address = resultSet.getString("address");
                        String grade = resultSet.getString("grade");
            %>
            <tr>
                <td><%= name %></td>
                <td><%= roll %></td>
                <td><%= address %></td>
                <td><%= grade %></td>
            </tr>
            <%
                    }

                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>

